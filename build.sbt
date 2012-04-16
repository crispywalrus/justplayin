
seq(scalateSettings: _*)

seq(protobufSettings: _*)

seq(webSettings: _*)

seq(coffeeSettings: _*)

seq(lessSettings: _*)

organization := "net.crispywalrus"

name := "justplayin"

version := "0.1.1-SNAPSHOT"

libraryDependencies ++= Seq(
  "net.databinder" %% "unfiltered-filter" % "0.5.3"
  , "javax.servlet" % "servlet-api" % "2.5" % "compile"
  , "org.eclipse.jetty" % "jetty-webapp" % "7.4.5.v20110725" % "container" 
  , "org.clapper" %% "grizzled-slf4j" % "0.6.6"
  , "net.databinder" %% "unfiltered-spec" % "0.5.3" % "test"
  , "org.squeryl" %% "squeryl" % "0.9.5-RC1"
  , "mysql" % "mysql-connector-java" % "5.1.18"
  // , "org.springframework" % "spring-webmvc" % "3.1.0.RELEASE"
  , "org.scalaz" %% "scalaz-core" % "6.0.4"
  , "com.codahale" %% "jerkson" % "0.5.0"
  , "javax.inject" % "javax.inject" % "1"
  , "javax.annotation" % "jsr250-api" % "1.0"
  , "org.jgroups" % "jgroups" % "3.0.5.Final"
  // , "org.zeromq" %% "zeromq-scala-binding" % "0.0.4"
  , "se.scalablesolutions.akka" % "akka-actor" % "1.3"
  , "se.scalablesolutions.akka" % "akka-amqp" % "1.3"
  // , "org.fusesource.scalate" % "scalate-core" % "1.3"
  , "ch.qos.logback" % "logback-core" % "1.0.0"
  , "com.basho.riak" % "riak-client" % "1.0.5"
  , "org.apache.hbase" % "hbase" % "0.92.0" exclude("com.sun.jersey","jersey-server") excludeAll(
    ExclusionRule(organization="org.apache.maven"),
    ExclusionRule(organization="org.apache.maven.doxia"),
    ExclusionRule(organization="org.apache.maven.plugins"),
    ExclusionRule(organization="org.apache.maven.release"),
    ExclusionRule(organization="org.apache.maven.reporting"),
    ExclusionRule(organization="org.apache.maven.scm"),
    ExclusionRule(organization="org.apache.maven.wagon"),
    ExclusionRule(organization="org.codehaus.plexus"),
    ExclusionRule(organization="org.sonatype.plexus"),
    ExclusionRule(organization="org.sonatype.spice"),
    ExclusionRule(organization="org.jruby"),
    ExclusionRule(organization="org.apache.thrift"),
    ExclusionRule(organization="org.mortbay.jetty"),
    ExclusionRule(organization="junit"),
    ExclusionRule(organization="org.mockito"),
    ExclusionRule(organization="org.eclipse.jdt"),
    ExclusionRule(organization="tomcat.jdt"),
    ExclusionRule(organization="com.sun.jersey"),
    ExclusionRule(organization="org.netbeans.lib"),
    ExclusionRule(organization="slide")
  )
)

resolvers ++= Seq(
  "repo1" at "http://repo1.maven.org/maven2"
  , "codahale" at "http://repo.codahale.com"
  , "java m2" at "http://download.java.net/maven/2"
  , "typesafe releases" at "http://repo.typesafe.com/typesafe/releases"
  , "akka" at "http://repo.typesafe.com/typesafe/releases")




