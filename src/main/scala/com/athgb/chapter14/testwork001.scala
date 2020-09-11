package com.athgb.chapter14

object testwork001 {
  def main(args: Array[String]): Unit = {
    val s= "hgb"
    println(reverse(s))
    def reverse(s: String):String=
      if (s.length == 1)
        s
      else
        reverse(s.tail) + s.head

  }

}
