package com.yusupov.chapter_10.tasks.task_2

import java.awt.Point

class OrderedPoint(x: Int, y: Int) extends java.awt.Point(x, y) with scala.math.Ordered[Point] {
  override def compare(that: Point): Int = {
    println("Comparision called")
    if (this.x == that.x && this.y == that.y) {
      0
    } else if (this.x < that.x || (this.x == that.x && this.y < that.y)) {
      -1
    } else {
      1
    }
  }

  override def toString = s"($x, $y)"
}
