package org.cristianpupazan.example

import org.apache.spark.SparkContext
import org.cristianpupazan.example.count.SimpleSparkCount

object SimpleSparkCountApp extends App {

  val sc = new SparkContext("spark://127.0.0.1:7077", "SimpleSparkCount")

  new SimpleSparkCount(sc).count("foo")
}


