package com.yusupov.chapter_7.tasks.task_3

package object random {
  val a = 1664525
  val b = 1013904223
  val n = 32

  var seed = 0

  def setSeed(seed: Int) {
    this.seed = seed
  }

  def nextInt: Int = {
    val previous = seed
    val result = ((previous * a + b) % math.pow(2, 32)).toInt
    seed = result
    result
  }

  def nextDouble:Double = {
    val previous = seed
    val result = (previous * a + b) % math.pow(2, 32)
    seed = result.toInt
    result
  }
}
