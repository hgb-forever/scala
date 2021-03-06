package com.athgb.chapter11

object viewDemo {
  def main(args: Array[String]): Unit = {
    def multiple(num: Int): Int = {
      num}
    def eq(i: Int): Boolean = {
      i.toString.equals(i.toString.reverse)
    }
    //说明: 没有使用view
    val viewSquares1 = (1 to 100)
      .map(multiple)
      .filter(eq)
    println(viewSquares1)
    //for (x <- viewSquares1) {}
    //使用view
    val viewSquares2 = (1 to 100)
      .view
      .map(multiple)
      .filter(eq)
    println(viewSquares2)

  }
}
