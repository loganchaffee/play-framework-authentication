package services

import javax.inject.{Inject, Singleton}
import play.api.db.Database

import javax.inject._
import play.api.libs.concurrent.CustomExecutionContext
import akka.actor.ActorSystem

@Singleton
class DatabaseService @Inject() (val db: Database)

/** This class is a pointer to an execution context configured to point to
  * "database.dispatcher" in the "application.conf" file.
  */
@Singleton
class DatabaseExecutionContext @Inject() (system: ActorSystem)
    extends CustomExecutionContext(system, "database.dispatcher")
