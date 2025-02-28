package services

import javax.inject.{Inject}
import play.api.db.Database
import models.User
import java.sql.SQLException
import java.sql.PreparedStatement
import java.sql.Statement
import scala.concurrent.Future

class UserService @Inject() (
    val databaseService: DatabaseService
)(implicit ec: DatabaseExecutionContext) {
  val db = databaseService.db

  def getUsers: Future[List[User]] = Future {
    db.withConnection { conn =>
      val resultSet = conn.prepareStatement("SELECT * FROM user").executeQuery

      Iterator
        .continually(resultSet)
        .takeWhile(rs => rs.next)
        .map(rs =>
          User(
            rs.getInt("id"),
            rs.getString("username"),
            rs.getString("password")
          )
        )
        .toList
    }
  }

  def getUserByUsername(username: String) = {
    db.withConnection { conn =>
      val stmt = conn.prepareStatement("SELECT * FROM user WHERE username = ?")
      stmt.setString(1, username)
      val resultSet = stmt.executeQuery

      if (resultSet.next) {
        Some(
          User(
            resultSet.getInt("id"),
            resultSet.getString("username"),
            resultSet.getString("password")
          )
        )
      } else {
        None
      }
    }
  }

  def getUserById(id: Int): Future[Option[User]] = Future {
    db.withConnection { conn =>
      val stmt = conn.prepareStatement("SELECT * FROM user WHERE id = ?")
      stmt.setInt(1, id)
      val resultSet = stmt.executeQuery

      if (resultSet.next) {
        Some(
          User(
            resultSet.getInt("id"),
            resultSet.getString("username"),
            resultSet.getString("password")
          )
        )
      } else {
        None
      }
    }
  }

  def createUser(username: String, hashedPassword: String): Option[Int] = {
    db.withConnection { conn =>
      val stmt = conn.prepareStatement(
        "insert into user (username, password) values (?, ?);",
        Statement.RETURN_GENERATED_KEYS
      )
      stmt.setString(1, username)
      stmt.setString(2, hashedPassword)
      stmt.executeUpdate

      val generatedKeys = stmt.getGeneratedKeys

      if (generatedKeys.next) {
        Some(generatedKeys.getLong(1).toInt)
      } else {
        None
      }
    }
  }
}
