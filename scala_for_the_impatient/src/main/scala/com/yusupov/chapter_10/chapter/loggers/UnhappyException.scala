package com.yusupov.chapter_10.chapter.loggers

import java.io.IOException

class UnhappyException extends IOException with LoggedException with ConsoleLogger {
  override def getMessage: String = "arghhh!"
}
