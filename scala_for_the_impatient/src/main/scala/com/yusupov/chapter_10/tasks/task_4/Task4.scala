package com.yusupov.chapter_10.tasks.task_4

import com.yusupov.chapter_10.chapter.loggers.ConsoleLogger

object Task4 extends App {

  val logger = new ConsoleLogger with CryptoLogger
  logger.log("abc")

  val logger1 = new {
    override val shift = -3
  } with ConsoleLogger with CryptoLogger
  logger1.log("def")

}
