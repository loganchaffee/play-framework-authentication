package actions

import play.api.mvc._
import javax.inject.Inject
import scala.concurrent.ExecutionContext

import play.api.mvc._
import scala.concurrent.Future

class LoggingAction @Inject() (parser: BodyParsers.Default)(implicit
    ec: ExecutionContext
) extends ActionBuilderImpl(parser) {
  override def invokeBlock[A](
      request: Request[A],
      block: (Request[A]) => Future[Result]
  ) = {
    println("HELLO FROM LOGGER")

    block(request)
  }
}
