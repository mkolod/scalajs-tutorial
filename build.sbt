lazy val root = project.in(file(".")).
  enablePlugins(ScalaJSPlugin)

name := "Scala.js Tutorial"

scalaVersion := "2.11.5"

resolvers += Resolver.url("scala-js-releases",
    url("http://dl.bintray.com/scala-js/scala-js-releases/"))(
    Resolver.ivyStylePatterns)

libraryDependencies += "be.doeraene" %%% "scalajs-jquery" % "0.7.0"

skip in packageJSDependencies := false
