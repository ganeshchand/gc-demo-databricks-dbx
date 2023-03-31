package com.gc.demo.databricks.dbx

import org.apache.spark.sql.SparkSession
trait LocalSparkSession {
    val spark = SparkSession.builder
      .appName("ganesh-dbx-demo-local")
      .master("local[*]")
    .enableHiveSupport()
    .config("spark.sql.extensions", "io.delta.sql.DeltaSparkSessionExtension")
    .config("spark.sql.catalog.spark_catalog", "org.apache.spark.sql.delta.catalog.DeltaCatalog")
    .getOrCreate()

    spark.sparkContext.setLogLevel("error")

}
