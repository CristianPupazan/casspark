package org.cristianpupazan.example.count

import org.scalatest.{Matchers, FunSpec}

class SimpleSparkCountTest extends FunSpec with Matchers with TestSparkContext {

  describe("dummy test") {

    it("should count characters of a given word") {
      new SimpleSparkCount(sc).count(1 to Int.MaxValue) shouldBe Int.MaxValue
    }
  }
}
