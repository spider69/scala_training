package com.yusupov.chapter_10.chapter

import com.yusupov.chapter_10.chapter.loggers.{ConsoleLogger, FileLogger, ShortLogger, TimestampLogger}

object Main extends App {
  val worker = new Worker with ConsoleLogger with TimestampLogger with ShortLogger {
    override val maxLength: Int = 20
  }
  worker.doWork()
  val worker1 = new Worker with ConsoleLogger with ShortLogger with TimestampLogger {
    override val maxLength: Int = 20
  }
  worker1.doWork()
  val worker2 = new {
    val fileName = "log.txt"
  } with Worker with FileLogger
  worker2.doWork()
}
