name := "scadepl-example"

version := "0.0.1"

scalaVersion := "2.11.8"

scalacOptions ++= Seq(
  "-encoding", "UTF-8",
  "-unchecked",
  "-deprecation",
  "-explaintypes",
  "-feature",
  //"-Yinline", "-Yinline-warnings",
  "-language:_",
  "-Xlint:_",
  "-Ywarn-unused"
)

libraryDependencies += "com.github.cornerman" %% "scadepl" % "0.0.1"

// only needed for debugger example
fork := true
connectInput in run := true
outputStrategy := Some(StdoutOutput)
