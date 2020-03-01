package com.yusupov.chapter_10.chapter.loggers

import java.io.PrintStream

trait FileLogger extends Logger {
  val fileName: String
  val out = new PrintStream(fileName)
  def log(msg: String) = { out.println(msg); out.flush() }
}
