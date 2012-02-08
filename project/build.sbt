
resolvers ++= Seq("gseitz@github" at "http://gseitz.github.com/maven/"
                  , "saisai" at "http://siasia.github.com/maven2" )

addSbtPlugin("com.github.gseitz" % "sbt-protobuf" % "0.2.2")

libraryDependencies <+= sbtVersion(v => "com.github.siasia" %% "xsbt-web-plugin" % (v+"-0.2.10"))


