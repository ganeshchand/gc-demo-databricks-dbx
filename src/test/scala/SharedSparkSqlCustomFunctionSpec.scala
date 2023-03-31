package com.gc.demo.databricks.dbx.common

import com.gc.demo.databricks.dbx.LocalSparkSession
import org.scalatest.{DoNotDiscover, Ignore}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers

@DoNotDiscover
@Ignore
class SharedSparkSqlCustomFunctionSpec extends AnyFlatSpec with Matchers
  with LocalSparkSession with SharedSparkSqlCustomFunction {

   "Hello Function" must "must return hello world" in {
        spark.sql("SELECT hello()").show()
    }
}