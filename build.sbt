
libraryDependencies += "org.scala-lang.modules" %% "scala-xml" % "1.0.2"

lazy val root = (project in file(".")).
  settings(
    name := "icdar-testsuite",
    version := "1.0",
    scalaVersion := "2.11.4"
  )