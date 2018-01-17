package im.tox.sbt

import com.etsy.sbt.checkstyle.CheckstyleConfigLocation.Classpath
import com.etsy.sbt.checkstyle.CheckstylePlugin.autoImport._
import sbt._
import sbt.plugins.JvmPlugin

object Checkstyle extends AutoPlugin {

  override def trigger: PluginTrigger = allRequirements
  override def requires: Plugins = JvmPlugin

  override val projectSettings = Seq(
    checkstyleConfigLocation := Classpath("checkstyle-config.xml"),
    checkstyleConfigLocation in Test := Classpath("checkstyle-test-config.xml")
  )

}
