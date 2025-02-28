package controllers

import javax.inject.Inject
import play.mvc.Action

import play.api._
import play.api.mvc._
import play.api.libs.json.Json

import services.UserService
import scala.util.Failure
import scala.util.Success
import actions.UserAction
import scala.concurrent.Future
import scala.concurrent.ExecutionContext

class UserController @Inject() (
    val userAction: UserAction,
    val cc: ControllerComponents,
    val userService: UserService,
    val JWTService: services.JWTService
)(implicit ec: ExecutionContext)
    extends AbstractController(cc) {

  def getUsers() = Action.async { request =>
    userService.getUsers
      .map(users => Ok(Json.toJson(users)))
      .recover { case ex: Exception =>
        InternalServerError(Json.obj("error" -> "Failed to fetch users"))
      }
  }

  def getMe() = userAction { request =>
    Ok(Json.toJson(request.user))
  }
}
