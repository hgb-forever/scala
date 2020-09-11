package com.athgb.chapter10

import scala.collection.mutable

object Maptest {
  def main(args: Array[String]): Unit = {
//    val map1 = scala.collection.mutable.Map("Alice" -> 10, "Bob" -> 20, "Kotlin" -> "北京","hgb" -> 22,"gg" -> 30)
//    println(map1)
//    val map3 = new scala.collection.mutable.HashMap[String, Int]
//    println(map3)
    val map4 = mutable.Map( ("A", 1), ("B", 2), ("C", 3),("D", 30) )
//    println("map4=" + map4)
//    println(map4("A"))
//    val value1 = map1("Alice")
//    println(value1)
//    println(map4.get("A")) //Some
//    println(map4.get("A").get) //得到Some在取出
//    println(map4.keySet)
//    println(map4.getOrElse("a","没有该值"))
//    map4 += ( "D" -> 4 )
//    map4 += ( "B" -> 50 )
//    println(map4)
//    map4 -= ("A", "B")
//    println("map4=" + map4)
    println(map4.keys)
    println(map4.values)
    for(v <- map4) println(v)

  }
}
