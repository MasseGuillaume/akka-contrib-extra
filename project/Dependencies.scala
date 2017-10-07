import sbt._

object Version {
  val akka       = "2.5.6"
  val akkaHttp   = "10.0.10"

  val nuprocess  = "1.1.2"

  val scala      = "2.12.3"

  val mockito    = "1.9.5"
  val scalaTest  = "3.0.1"
}

object Library {
  val akkaCluster           = "com.typesafe.akka" %% "akka-cluster"          % Version.akka
  val akkaHttp              = "com.typesafe.akka" %% "akka-http"             % Version.akkaHttp
  val akkaStream            = "com.typesafe.akka" %% "akka-stream"           % Version.akka
  val akkaDistributedData   = "com.typesafe.akka" %% "akka-distributed-data" % Version.akka
  val akkaTestkit           = "com.typesafe.akka" %% "akka-testkit"          % Version.akka
  val akkaHttpTestkit       = "com.typesafe.akka" %% "akka-http-testkit"     % Version.akkaHttp
  val mockitoAll            = "org.mockito"       %  "mockito-all"           % Version.mockito
  val nuprocess             = "com.zaxxer"        %  "nuprocess"             % Version.nuprocess
  val scalaTest             = "org.scalatest"     %% "scalatest"             % Version.scalaTest
}
