package org.cristianpupazan.example.count

import org.apache.spark.{SparkConf, SparkContext}
import org.scalatest.{BeforeAndAfterAll, Suite}


trait TestSparkContext extends BeforeAndAfterAll {
  this: Suite =>

  val conf = new SparkConf(true)
  .setMaster("spark://localhost:7077")
  //  .setMaster("local[1]")
  .setAppName("test")
  val sc = new SparkContext(conf)

  override def afterAll() = sc.stop()
}
