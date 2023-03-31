package com.gc.demo.databricks.dbx.common

import com.gc.demo.databricks.dbx.LocalSparkSession
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers

class SharedSparkUdfSpec extends AnyFlatSpec with Matchers
  with LocalSparkSession with SharedSparkUDF {
    "Hello UDF" must "must return hello world" in {
        spark.range(1).select(helloUDF()).collect().head.getString(0) mustBe "Hello World!"
    }
}