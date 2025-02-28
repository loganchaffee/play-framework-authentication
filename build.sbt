name := """play-framework-authentication"""
organization := "com.loganchaffee"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.16"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "6.0.0" % Test
libraryDependencies ++= Seq(jdbc)
libraryDependencies ++= Seq("com.mysql" % "mysql-connector-j" % "8.0.33")
libraryDependencies += "at.favre.lib" % "bcrypt" % "0.10.2"
libraryDependencies += "com.github.jwt-scala" %% "jwt-play-json" % "10.0.4"
