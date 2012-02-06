import sbtprotobuf.{ProtobufPlugin=>PB}

seq(PB.protobufSettings: _*)

organization := "com.example"

name := "justplayin"

version := "0.1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  "net.databinder" %% "unfiltered-filter" % "0.5.3",
  "net.databinder" %% "unfiltered-jetty" % "0.5.3",
  "org.clapper" %% "avsl" % "0.3.6",
  "net.databinder" %% "unfiltered-spec" % "0.5.3" % "test",
  "org.squeryl" %% "squeryl" % "0.9.5-RC1",
  "mysql" % "mysql-connector-java" % "5.1.18"
)

resolvers ++= Seq(
  "java m2" at "http://download.java.net/maven/2"
)


