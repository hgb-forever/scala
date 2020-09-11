package com.athgb.chapter04

import scala.io.StdIn

object testwork002 {
  def main(args: Array[String]): Unit = {
  println("请输入n的值:")
    var n = StdIn.readInt()
    print("结果为:"+t2(n))
  }
  def t2(n:Int): Int ={
    if(n==1)
      return 3
    else{
      t2(n-1)*2+1
    }
  }
}
