package com.athgb.chapter03

import util.control.Breaks._

object homework002_3 {
  def main(args: Array[String]): Unit = {
    //10以内的数求和，求出当和第一次大于20的数
    var sum = 0
    breakable {
    for (i <- 1 to 10) {
      sum += i
      if (sum > 20) {
        println("和第一次大于20的数为:" + i)
        break()
      }
    }
  }

//    使用循环守卫来解决
    var sum2=0
    var flag=true
    println("=====================")
    for(i <- 1 to 10 if flag  ){
      sum2 += i
      if(sum2>20){
        println("循环守卫中断 " +"和第一次大于20的数为:" + i)
        flag = false
      }
    }
}

}
