import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "collins"
    val appVersion      = "1.2.1"

    val appDependencies = Seq()

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(
    )

}
