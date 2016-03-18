package org.cristianpupazan.example

import org.apache.spark.{SparkConf, SparkContext}
import org.cristianpupazan.example.count.SimpleSparkCount

object SimpleSparkCountApp extends App {

  val conf = new SparkConf(true)
    .setMaster("spark://localhost:7077")
    .setAppName("SimpleSparkCount")
  val sc = new SparkContext(conf)

  new SimpleSparkCount(sc).count(1 to 10)
}


