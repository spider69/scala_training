package com.yusupov.chapter_10.chapter

import com.yusupov.chapter_10.chapter.loggers.Logger

abstract class Worker extends Logger {
  def doWork(): Unit = {
    log("Doing sophisticated work...")
  }
}
