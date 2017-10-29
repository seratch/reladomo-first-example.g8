scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")
resolvers += "sonatype releases" at "https://oss.sonatype.org/content/repositories/releases"
addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.0.0-RC12-1")
addSbtPlugin("com.folio-sec" % "sbt-reladomo-plugin" % "16.6.0")
