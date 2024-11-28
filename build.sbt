val pekkoVersion = "1.1.2"
val pekkoHttpVersion = "1.1.0"
val scala3Version = "3.3.4"

lazy val root = project
  .in(file("."))
  .settings(
    organization := "ch.usi.si.msde.edsl",
    name := "assignment-03-template",
    version := "2024.1",
    scalaVersion := scala3Version,
    scalacOptions ++= Seq("-feature"),
    fork := true,
    libraryDependencies += "org.apache.pekko" %% "pekko-actor-typed" % pekkoVersion,
    libraryDependencies += "org.apache.pekko" %% "pekko-stream" % pekkoVersion,
    libraryDependencies += "org.apache.pekko" %% "pekko-http" % pekkoHttpVersion,
    libraryDependencies += "org.apache.pekko" %% "pekko-http-spray-json" % pekkoHttpVersion
  )
