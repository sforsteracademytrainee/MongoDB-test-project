import play.sbt.routes.RoutesKeys

name := "MongoDB test"
 
version := "1"
      
lazy val `recipies_new_play_version` = (project in file(".")).enablePlugins(PlayScala)

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"
      
resolvers += "Akka Snapshot Repository" at "https://repo.akka.io/snapshots/"
      
scalaVersion := "2.13.5"

libraryDependencies ++= Seq( jdbc , ehcache , ws , specs2 % Test , guice )

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )

libraryDependencies += "org.mongodb.scala" %% "mongo-scala-driver" % "4.2.2"
libraryDependencies += "org.reactivemongo" %% "play2-reactivemongo" % "0.20.13-play27"

RoutesKeys.routesImport += "play.modules.reactivemongo.PathBindables._"