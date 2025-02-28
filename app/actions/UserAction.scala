package actions

import play.api.mvc._
import scala.concurrent.ExecutionContext
import scala.concurrent.Future
import javax.inject.Inject
import models.User
import services.{JWTService, UserService}

class UserRequest[A](val user: User, request: Request[A])
    extends WrappedRequest[A](request)

class UserAction @Inject() (
    val parser: BodyParsers.Default,
    val JWTService: JWTService,
    val userService: UserService
)(implicit val executionContext: ExecutionContext)
    extends ActionBuilder[UserRequest, AnyContent]
    with ActionRefiner[Request, UserRequest] {

  def refine[A](request: Request[A]): Future[Either[Result, UserRequest[A]]] = {
    request.headers.get("Authorization") match {
      case Some(tokenString) => {
        val token = tokenString.stripPrefix("Bearer ")

        JWTService.verifyToken(token) match {
          case Right(jwtPayload) =>
            userService
              .getUserById(jwtPayload.userId)
              .map {
                case Some(user) => Right(new UserRequest(user, request))
                case None       => Left(Results.Unauthorized("Unauthorized"))
              }
              .recover { case ex: Exception =>
                // Failed to get user from database
                Left(
                  Results.InternalServerError("Something wh")
                )
              }

          case Left(_) =>
            Future.successful(Left(Results.Unauthorized("Invalid token")))
        }
      }

      case None => {
        Future.successful(
          Left(Results.Unauthorized("Missing Authorization header"))
        )
      }
    }
  }
}
