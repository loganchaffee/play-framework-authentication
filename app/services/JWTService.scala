package services

import java.time.Clock

import pdi.jwt._
import play.api.libs.json.Json
import play.api.libs.json._
import scala.util.Failure
import scala.util.Success
import scala.util.Try

case class JWTPayload(userId: Int)

object JWTPayload {
  implicit val format: Format[JWTPayload] = Json.format[JWTPayload]
}

class JWTService {
  implicit val clock: Clock = Clock.systemUTC

  private val key = "secretKey" // use env var

  def createToken(userId: Int) = {
    val claim = Json.obj(("userId", userId))

    JwtJson.encode(claim, key, JwtAlgorithm.HS256)
  }

  def verifyToken(token: String) =
    JwtJson
      .decode(token, key, Seq(JwtAlgorithm.HS256))
      .toEither
      .flatMap(claim => Try(Json.parse(claim.content).as[JWTPayload]).toEither)
      .left
      .map(x => x)

}
