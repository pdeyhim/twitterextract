import sbt._
import sbt.Keys._

object TwitterextractBuild extends Build {

  lazy val twitterextract = Project(
    id = "twitterextract",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "TwitterExtract",
      organization := "com.amazonaws",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.9.2",
      resolvers += "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases",
      libraryDependencies += "com.typesafe.akka" % "akka-actor" % "2.0.1",
      libraryDependencies += "org.twitter4j" % "twitter4j-core" % "3.0.3",
      libraryDependencies += "org.twitter4j" % "twitter4j-stream" % "3.0.3"
    )
  )
}
