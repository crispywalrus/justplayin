
seq(protobufSettings: _*)

seq(appengineSettings: _*)

seq(liquibaseSettings: _*)

liquibaseUsername := "liqui" 

liquibasePassword := "base"

liquibaseDriver := "com.mysql.jdbc.Driver"

liquibaseUrl := "jdbc:mysql://localhost:3306/justplayindb"

organization := "net.crispywalrus"

name := "justplayin"

version := "0.1.1-SNAPSHOT"

libraryDependencies ++= Seq(
  "net.databinder" %% "unfiltered-filter" % "0.5.3",
  "net.databinder" %% "unfiltered-jetty" % "0.5.3",
  "org.clapper" %% "avsl" % "0.3.6",
  "net.databinder" %% "unfiltered-spec" % "0.5.3" % "test",
  "org.squeryl" %% "squeryl" % "0.9.5-RC1",
  "mysql" % "mysql-connector-java" % "5.1.18",
  "org.mortbay.jetty" % "jetty" % "6.1.22" % "container",
  "org.scalaz" %% "scalaz-core" % "6.0.4",
  "com.codahale" %% "jerkson" % "0.5.0",
  "com.mongodb.casbah" %% "casbah" % "2.1.5-1"
)

resolvers ++= Seq(
  "java m2" at "http://download.java.net/maven/2",
  "codahale" at "http://repo.codahale.com"
)


