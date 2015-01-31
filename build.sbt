//import SonatypeKeys._

lazy val commonSettings = Seq(
  organization := "biz.enef",
  version := "0.1-SNAPSHOT",
  scalaVersion := "2.11.5",
  scalacOptions ++= Seq("-deprecation","-feature","-Xlint"),
  // work around for a bug during publishing
  scalacOptions in (Compile,doc) ~= { _.filterNot(_.contains("scalajs-compiler_")) }
)


lazy val root = project.in(file(".")).
  enablePlugins(ScalaJSPlugin).
  settings(commonSettings: _*).
  settings(publishingSettings: _*).
  //settings(sonatypeSettings: _*).
  settings( 
    name := "scalajs-svgjs",
    libraryDependencies ++= Seq(
      "org.scala-lang" % "scala-reflect" % scalaVersion.value
    ),
    resolvers += Resolver.sonatypeRepo("releases")
  )


lazy val tests = project.
  dependsOn(root).
  enablePlugins(ScalaJSPlugin).
  settings(commonSettings: _*).
  settings(utest.jsrunner.Plugin.utestJsSettings: _*).
  settings(
    publish := {},
    scalaJSStage := FastOptStage,
    jsDependencies += RuntimeDOM
  )


lazy val publishingSettings = Seq(
  publishMavenStyle := true,
  publishTo := {
    val nexus = "https://oss.sonatype.org/"
    if (isSnapshot.value)
      Some("snapshots" at nexus + "content/repositories/snapshots")
    else
      Some("releases"  at nexus + "service/local/staging/deploy/maven2")
  },
  pomExtra := (
    <url>https://github.com/jokade/scalajs-svgjs</url>
    <licenses>
      <license>
        <name>MIT License</name>
        <url>http://www.opensource.org/licenses/mit-license.php</url>
      </license>
    </licenses>
    <scm>
      <url>git@github.com:jokade/scalajs-angulate</url>
      <connection>scm:git:git@github.com:jokade/scalajs-svgjs.git</connection>
    </scm>
    <developers>
      <developer>
        <id>jokade</id>
        <name>Johannes Kastner</name>
        <email>jokade@karchedon.de</email>
      </developer>
    </developers>
  )
)

