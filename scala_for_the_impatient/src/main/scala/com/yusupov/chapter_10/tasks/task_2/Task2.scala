package com.yusupov.chapter_10.tasks.task_2

import scala.collection.{BitSet, SortedSet}

object Task2 extends App {
  BitSet
  val point1 = new OrderedPoint(5, 5)
  val point2 = new OrderedPoint(4, 1)
  val point3 = new OrderedPoint(-1, -1)
  val point4 = new OrderedPoint(5, 4)
  val points = SortedSet(point1, point2, point3, point4)

  println(points)
}
