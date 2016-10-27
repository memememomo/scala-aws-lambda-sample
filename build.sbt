val Version = "0.1-SNAPSHOT"

lazy val root = (project in file(".")).settings(
  name := "aws-lambda-sample",
  version := Version,
  organization := "com.example",
  scalaVersion := "2.11.8",
  libraryDependencies ++= Seq(
    "com.amazonaws" % "aws-lambda-java-core" % "1.0.0",
    "com.amazonaws" % "aws-lambda-java-events" % "1.1.0"
  ),
  assemblyJarName in assembly := "aws-lambda-sample-%s.jar" format(Version)
)
