package com.athgb.chapter11

object parallelDemo {
  def main(args: Array[String]): Unit = {
    (1 to 5).foreach(println(_))
    println()
    (1 to 5).par.foreach(println(_))
    val result1 = (0 to 10).map{case _ => Thread.currentThread.getName}
    val result2 = (0 to 10).par.map{case _ => Thread.currentThread.getName}
    println(result1)
    println(result2)
    val n1 = 1
    val n2 = 2
    val r1 = n1 + n2
    val r2 = n1.+(n2) //看Int的源码即可说明t
    println("r1=" + r1 + " r2=" + r2)

  }
}
