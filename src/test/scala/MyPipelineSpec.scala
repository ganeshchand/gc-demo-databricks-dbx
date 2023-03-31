package com.gc.demo.databricks.dbx

import org.apache.spark.sql.SparkSession
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers

class MyPipelineSpec extends AnyFlatSpec with Matchers with LocalSparkSession {
    "MyPipeline" must "have local spark session" in {
        SparkSession.getActiveSession.isDefined mustBe true
    }
    it must "execute helloUDF" in {
        new MyPipeline(spark).run()
    }
}