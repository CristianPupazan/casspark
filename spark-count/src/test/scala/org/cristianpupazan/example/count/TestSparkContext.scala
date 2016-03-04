package org.cristianpupazan.example.count

import org.apache.spark.SparkContext
import org.scalatest.{BeforeAndAfterAll, Suite}


trait TestSparkContext extends BeforeAndAfterAll {
  this: Suite =>

  val sc = new SparkContext("spark://localspark:7077", "test")

  override def afterAll() = sc.stop()
}
