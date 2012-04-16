
resolvers ++= Seq("gseitz@github" at "http://gseitz.github.com/maven/"
                  , "saisai" at "http://siasia.github.com/maven2" )

resolvers += Resolver.url("sbt-plugin-releases",
                          new URL("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases/"))(
                            Resolver.ivyStylePatterns)

addSbtPlugin("net.databinder" % "posterous-sbt" % "0.3.2")

addSbtPlugin("me.lessis" % "less-sbt" % "0.1.9")

addSbtPlugin("com.github.gseitz" % "sbt-protobuf" % "0.2.2")

addSbtPlugin("me.lessis" % "coffeescripted-sbt" % "0.2.1")

addSbtPlugin("com.mojolly.scalate" % "xsbt-scalate-generator" % "0.1.1")

libraryDependencies <+= sbtVersion(v => "com.github.siasia" %% "xsbt-web-plugin" % (v+"-0.2.10"))


