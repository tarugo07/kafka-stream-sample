name := "kafka-stream-sample"

version := "1.0"

scalaVersion := "2.12.1"

libraryDependencies ++= Seq(
  "org.apache.kafka" % "kafka_2.10" % "0.10.1.1",
  "org.apache.kafka" % "kafka-streams" % "0.10.1.1",
  "org.apache.kafka" % "kafka-clients" % "0.10.1.1",
  "org.scalatest" %% "scalatest" % "3.0.1" % "test"
)
