package com.gc.demo.databricks.dbx

import com.gc.demo.databricks.dbx.common.SharedSparkUDF
import org.apache.spark.sql.SparkSession

class MyPipeline(spark: SparkSession) extends SharedSparkUDF {
  def run(): Unit = {
    spark.range(1).select(helloUDF()).show()
  }
}
object App extends SharedSparkUDF {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder.getOrCreate()
    new MyPipeline(spark).run()
  }
}
