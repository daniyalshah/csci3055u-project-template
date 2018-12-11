name                := "JsonReader"
version             := "1.0"
scalaVersion        := "2.11.7"
libraryDependencies ++= Seq(
        "org.apache.spark" %% "spark-core" % "2.1.1",
        "org.scalatest" %% "scalatest" % "3.0.1" % "test",
)
