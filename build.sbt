import play.PlayImport.PlayKeys._
import sbt.Project.projectToRef

name := "play-ground"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.6"

lazy val myProject = (project in file("."))
	.settings(
		libraryDependencies ++= Seq(
			"com.h2database" % "h2" % "1.4.187",
			"com.typesafe.play" %% "play-slick-evolutions" % "1.0.0",
			"com.typesafe.play" %% "play-slick" % "1.0.0"
		)
	)
  	.enablePlugins(PlayScala)