package dto

import play.api.libs.json._

case class AuthOutput(token: String)

object AuthOutput {
  implicit val format: Format[AuthOutput] = Json.format[AuthOutput]
}
