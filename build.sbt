name := "emoji"

organization := "com.lightbend"

version := "1.1.2-SNAPSHOT"

crossScalaVersions := Seq("2.12.3", "2.11.11")
scalaVersion := crossScalaVersions.value.head

bintrayOrganization := Some("typesafe")
bintrayRepository := "ivy-releases"
bintrayPackage := "emoji"
bintrayReleaseOnPublish := false

publishMavenStyle := false

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature", "-Xfatal-warnings")

licenses += ("Apache-2.0", url("https://www.apache.org/licenses/LICENSE-2.0.html"))

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.4" % Test
)

initialCommands in console := {
  """import com.lightbend.emoji._
    |import com.lightbend.emoji.Emoji.Implicits._
    |import com.lightbend.emoji.ShortCodes.Implicits._
    |""".stripMargin
}
