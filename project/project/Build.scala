import sbt._
import sbt.Keys._

object PluginDef extends Build {
  override def projects = Seq(root)
  //lazy val root = Project("plugins", file(".")) dependsOn(dm)
  lazy val root = Project("plugins", file(".")) dependsOn()
  lazy val dm = uri("git://github.com/digimead/sbt-dependency-manager.git#e768")
}
