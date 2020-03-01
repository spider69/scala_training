package com.yusupov.chapter_10.chapter.loggers

trait LoggedException extends Logger {
  this: Exception =>
    def log(): Unit = log(getMessage)
}
