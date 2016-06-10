name := """play-scala-intro"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play-slick" % "2.0.0",
//  "com.typesafe.play" %% "play-slick-evolutions" % "2.0.0",
  "org.postgresql"    %  "postgresql" % "9.4-1206-jdbc4",
  specs2 % Test
)

