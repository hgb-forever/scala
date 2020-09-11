package com.athgb.chapter12

object MatchDemo {
  def main(args: Array[String]): Unit = {
    val obj:Any = 10
    val result = obj match {
      case a : Int => a
      case b : Map[String, Int] => "Map集合"
      case _ => "啥也不是"
    }
  }
}
