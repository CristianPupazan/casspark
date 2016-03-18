package org.cristianpupazan.example.count

import org.apache.spark.SparkContext

class SimpleSparkCount(sc: SparkContext) {

  def count(numbers: Seq[Int]): Long = sc.parallelize(numbers).count()
}
