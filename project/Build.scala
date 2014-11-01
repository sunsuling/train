import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "train"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
     javaCore,
	  javaJdbc,
	  javaEbean,
	  "com.github.mumoshu" %% "play2-memcached" % "0.3.0.2",
	  //"mchv" %% "play2-quartz" % "1.1",
	  "jaxen" % "jaxen" % "1.1.4",
	  "javax.mail" % "mail" % "1.4.7",
	  "jp.furyu" %% "play-c3p0-plugin" % "0.2.1"
  )


  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here 
    resolvers += "Spy Repository" at "http://files.couchbase.com/maven2"     
  )

}
