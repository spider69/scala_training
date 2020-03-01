package com.yusupov.chapter_10.tasks.task_4

import com.yusupov.chapter_10.chapter.loggers.Logger

trait CryptoLogger extends Logger {
  val shift: Int = 3

  def encrypt(message: String) = message.toCharArray.map(c => (c + shift).toChar).mkString

  abstract override def log(msg: String): Unit = super.log(encrypt(msg))
}
