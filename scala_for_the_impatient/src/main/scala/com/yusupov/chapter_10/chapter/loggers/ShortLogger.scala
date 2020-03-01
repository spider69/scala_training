package com.yusupov.chapter_10.chapter.loggers

trait ShortLogger extends Logger {
  val maxLength: Int
  abstract override def log(msg: String): Unit = {
    super.log( if (msg.length < maxLength) msg else s"${msg.substring(0, maxLength - 3)}...")
  }
}
