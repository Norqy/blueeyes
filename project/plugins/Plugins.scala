import sbt._
class Plugins(info: ProjectInfo) extends PluginDefinition(info)
{
  val eclipsify = "de.element34" % "sbt-eclipsify" % "0.6.0"
  val sbtIdeaRepo = "sbt-idea-repo" at "http://mpeltonen.github.com/maven/"
  val sbtIdea = "com.github.mpeltonen" % "sbt-idea-plugin" % "0.1-SNAPSHOT"
  val gpgPlugin = "com.rossabaker" % "sbt-gpg-plugin" % "0.1.1"
}

