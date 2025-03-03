package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import play.api.libs.json.Json
import at.favre.lib.crypto.bcrypt.BCrypt
import java.time.Clock
import pdi.jwt._

import dto.AuthInput
import models.User
import services.DatabaseService
import services.UserService
import services.JWTService
import dto.AuthOutput
import scala.concurrent.ExecutionContext
import scala.concurrent.Future

class AuthController @Inject() (
    val controllerComponents: ControllerComponents,
    val userService: UserService,
    val JWTService: JWTService
)(implicit ec: ExecutionContext)
    extends BaseController {

  def signup() = Action.async(parse.json) { implicit request =>
    val input = request.body.as[AuthInput]

    userService.getUserByUsername(input.username).flatMap {
      case Some(existingUser) => {
        Future.successful(
          Conflict(Json.obj("error" -> "Username is already in use"))
        )
      }
      case None => {
        val hashedPassword =
          BCrypt.withDefaults.hashToString(12, input.password.toCharArray);
        userService.createUser(input.username, hashedPassword).map {
          case Some(newUserId) => {
            val token = JWTService.createToken(newUserId)
            Ok(Json.toJson(AuthOutput(token)))
          }
          case None => InternalServerError("An unexpected error occurred.")
        }
      }
    }
  }

  def signin() = Action.async(parse.json) { implicit request =>
    val input = request.body.as[AuthInput]

    userService.getUserByUsername(input.username).map {
      case Some(existingUser) => {
        val isValidPwd = BCrypt.verifyer
          .verify(
            input.password.toCharArray,
            existingUser.password.toCharArray
          )
          .verified

        if (isValidPwd) {
          val token = JWTService.createToken(existingUser.id)
          Ok(Json.toJson(AuthOutput(token)))
        } else {
          Unauthorized("Invalid credentials")
        }
      }
      case None => Unauthorized("Invalid credentials")
    }
  }
}
