package com {
  package horstmann {
    object Utils {
      def percentOf(value: Double, rate: Double) = value * rate / 100
    }
    package impatient {
      import scala.collection.mutable._
      class Manager {
        val subordinates = new ArrayBuffer[Employee]
        var salary = 0.0
        def giveRaise(rate: scala.Double) {
          salary += Utils.percentOf(salary, rate)
        }
      }
    }
  }
}


