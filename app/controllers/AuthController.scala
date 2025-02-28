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

class AuthController @Inject() (
    val controllerComponents: ControllerComponents,
    val userService: UserService,
    val JWTService: JWTService
) extends BaseController {

  def signup() = Action(parse.json) { implicit request =>
    // Get username and password from request body
    val input = request.body.as[AuthInput]

    // Check if username is taken in DB
    val maybeExistingUser = userService.getUserByUsername(input.username)

    maybeExistingUser match {
      case Some(existingUser) => Ok("username taken")
      case None => {
        val hashedPassword =
          BCrypt.withDefaults.hashToString(12, input.password.toCharArray);

        userService.createUser(input.username, hashedPassword) match {
          case None => InternalServerError("An unexpected error occurred.")
          case Some(newUserId) => {
            val token = JWTService.createToken(newUserId)

            Ok(Json.toJson(AuthOutput(token)))
          }
        }
      }
    }
  }

  def signin() = Action(parse.json) { implicit request =>
    // Get username and password from request body
    val input = request.body.as[AuthInput]

    // Check if username is taken in DB
    val maybeUser = userService.getUserByUsername(input.username)

    maybeUser match {
      case Some(existingUser) => {
        // check password
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
