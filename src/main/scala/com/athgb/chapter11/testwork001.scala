package com.athgb.chapter11

import scala.collection.mutable.ListBuffer


object testwork001 {
  def main(args: Array[String]): Unit = {
    var list =List[Int]()
    list :+= 9
    list :+= 10

//    for (i <- 0 until list.length)
//      list(i) = list(i)*2
//    println(i)
    println(list)

  }
}
