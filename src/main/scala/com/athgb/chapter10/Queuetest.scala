package com.athgb.chapter10

import scala.collection.immutable.StringOps
import scala.collection.mutable

object Queuetest {
  def main(args: Array[String]): Unit = {
    val ints = mutable.Queue(1,2,"hgb")
    println(ints)
    ints += 6
    println(ints)
    ints += List(9,6,1,16,"hgb")
    println(ints)
    ints.dequeue()
    println(ints)
    ints.enqueue(6)
    println(ints)
  }
}
