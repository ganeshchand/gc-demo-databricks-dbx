package com.gc.demo.databricks.dbx.common

import org.apache.spark.sql.expressions.UserDefinedFunction
import org.apache.spark.sql.functions._
trait SharedSparkUDF {
  def helloUDF: UserDefinedFunction = udf { () => "Hello World!" }
}
