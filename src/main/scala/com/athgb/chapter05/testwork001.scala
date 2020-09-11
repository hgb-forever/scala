package com.athgb.chapter05

object testwork001 {
  def main(args: Array[String]): Unit = {
   var  n1=new MethodExc
    n1.m=2
    n1.n=3
    println(n1.count())
    n1.panduan(10)
  }
  class MethodExc{
    var m:Double=_
    var n:Double=_
    def t1(m:Double,n:Double) {
      for (i <- 0 until  m.toInt)
        {
          for (j <- 0 until n.toInt)
            print("*")
          println()
        }
    }
    def count(): Double ={
      this.t1(this.m,this.n)
      return this.m*this.n
    }

    def panduan(n:Int): Unit ={
      if(n % 2== 0)
        println("该数是偶数")
      else
        println("该数是奇数")
    }
  }
}
