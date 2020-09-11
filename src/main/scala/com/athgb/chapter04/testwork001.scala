package com.athgb.chapter04

import scala.io.StdIn

object testwork001 {
  def main(args: Array[String]): Unit = {
  println("请输入n的值:")
    var n = StdIn.readInt()
    println("结果为:"+t1(n))
    print("吃了"+eat(n))
  }
  def t1(n:Int): Int ={
  if(n == 1 || n == 2)
    return 1
    else{
    t1(n-1)+t1(n-2)
  }
  }
  def eat(n:Int): Int ={
    if(n==10)
      return 1
    else
     return  (eat(n+1)+1)*2
  }
}
