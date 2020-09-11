package com.athgb.chapter10

import scala.collection.mutable.ArrayBuffer

object testwork001 {
  def main(args: Array[String]): Unit = {
//    var array = Array(3,9,"hgb")
//    for(i <- array)
//      println(i)
var array = ArrayBuffer(3,9,"hgb")
    for(i <- array)
      println(i)
    println(System.identityHashCode(array))
       array.append("gg")
    array.toArray
    array(9)
    println(System.identityHashCode(array))
  }
}
