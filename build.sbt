ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.12"

lazy val root = (project in file(".")).enablePlugins(PlayScala)
  .settings(
    name := "AgilePoker"
  )

libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "7.0.0" % Test