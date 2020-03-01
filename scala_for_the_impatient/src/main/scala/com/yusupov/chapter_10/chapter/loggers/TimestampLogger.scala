package com.yusupov.chapter_10.chapter.loggers

trait TimestampLogger extends Logger {
  abstract override def log(msg: String): Unit = {
    super.log(s"${java.time.Instant.now()} $msg")
  }
}
