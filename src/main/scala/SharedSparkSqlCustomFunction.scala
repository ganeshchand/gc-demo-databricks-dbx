package com.gc.demo.databricks.dbx.common

import org.apache.spark.sql.SparkSession

trait SharedSparkSqlCustomFunction {
  private val _spark: SparkSession = SparkSession.active
  def registerSqlFunctions(): Unit = {
    val hello: String = "CREATE OR REPLACE TEMPORARY FUNCTION IF NOT EXISTS  hello() RETURNS STRING RETURN 'Hello World!';"
    _spark.sql(hello)
  }



}
