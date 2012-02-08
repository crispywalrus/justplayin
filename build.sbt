
seq(protobufSettings: _*)

seq(webSettings :_*)

libraryDependencies += "org.mortbay.jetty" % "jetty" % "6.1.22" % "container"

organization := "net.crispywalrus"

name := "justplayin"

version := "0.1.1-SNAPSHOT"

libraryDependencies ++= Seq(
  "net.databinder" %% "unfiltered-filter" % "0.5.3"
  , "javax.servlet" % "servlet-api" % "2.5" % "provided"
  , "org.eclipse.jetty" % "jetty-webapp" % "7.4.5.v20110725" % "container"
  , "org.clapper" %% "avsl" % "0.3.6"
  , "net.databinder" %% "unfiltered-spec" % "0.5.3" % "test"
  , "org.squeryl" %% "squeryl" % "0.9.5-RC1"
  , "mysql" % "mysql-connector-java" % "5.1.18"
  , "org.springframework" % "spring-webmvc" % "3.1.0.RELEASE"
  , "org.scalaz" %% "scalaz-core" % "6.0.4"
  , "com.codahale" %% "jerkson" % "0.5.0"
  , "javax.inject" % "javax.inject" % "1"
  , "javax.annotation" % "jsr250-api" % "1.0"
  , "org.jgroups" % "jgroups" % "3.0.5.Final"
)

resolvers ++= Seq(
  "repo1" at "http://repo1.maven.org/maven2"
  , "codahale" at "http://repo.codahale.com"
  , "java m2" at "http://download.java.net/maven/2"
)


