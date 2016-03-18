package org.cristianpupazan.example.count

import org.scalatest.{Matchers, FunSpec}

class SimpleSparkCountTest extends FunSpec with Matchers with TestSparkContext {

  describe("Simple Spark Count") {

    it("should count some numbers") {
      new SimpleSparkCount(sc).count(1 to Int.MaxValue) shouldBe Int.MaxValue
    }
  }
}
