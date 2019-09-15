package com {
  object ComUtils {
    val value = "Com utils"
  }

  package horstmann {
    object HorstmannUtils {
      val value = "Horstmann utils"
    }

    package impatient {
      object ImpatientUtils {
        val value = s"Impatient utils: ${HorstmannUtils.value} ${ComUtils.value}"
      }
    }
  }
}
