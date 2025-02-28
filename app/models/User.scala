package models

import play.api.libs.json._

case class User(id: Int, username: String, password: String)

object User {
  implicit val format: Format[User] = Json.format[User]
}
