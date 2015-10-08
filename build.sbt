name := "akka-sample-main-java"

version := "2.3.0"

scalaVersion := "2.10.3"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.3.1"
)


fork in run := true