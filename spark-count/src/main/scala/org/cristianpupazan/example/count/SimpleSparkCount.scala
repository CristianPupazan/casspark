package org.cristianpupazan.example.count

import org.apache.spark.SparkContext

class SimpleSparkCount(sc: SparkContext) {

  def count(word: String): Long = sc.makeRDD(word.toCharArray.toSeq).count()

}
