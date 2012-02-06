resolvers ++= Seq("gseitz@github" at "http://gseitz.github.com/maven/",
                  "bigtoast-github" at "http://bigtoast.github.com/repo/")

addSbtPlugin("com.github.gseitz" % "sbt-protobuf" % "0.2.2")

addSbtPlugin("atd" % "sbt-liquibase" % "0.3")

addSbtPlugin("com.eed3si9n" % "sbt-appengine" % "0.3.1")

