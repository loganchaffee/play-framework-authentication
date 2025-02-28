package dto

import play.api.libs.json._

case class AuthInput(username: String, password: String)

object AuthInput {
  implicit val format: Format[AuthInput] = Json.format[AuthInput]
}
