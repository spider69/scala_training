package com.yusupov.chapter_10.chapter.loggers

trait ConsoleLogger extends Logger with Cloneable with Serializable {
  def log(msg: String): Unit = { println(msg) }
}
