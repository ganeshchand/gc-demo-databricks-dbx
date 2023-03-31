name := "gc-demo-databricks-dbx"
version := "1.0"
scalaVersion := "2.12.17"

mainClass := Some("com.gc.demo.databricks.dbx.App")

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-sql" % "3.3.2" % Provided,
  "io.delta" %% "delta-core" % "2.2.0" % Provided,
  "org.apache.spark" %% "spark-hive" % "3.3.2" % Provided,
   "org.scalatest" %% "scalatest" % "3.2.15" % Test
)
