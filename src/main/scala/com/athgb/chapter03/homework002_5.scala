package com.athgb.chapter03

object homework002_5 {
  def main(args: Array[String]): Unit = {
    //>50000 ,每次交5%
//    <=50000,每次交1000
//    总金额100000
    var money = 100000.0
    var t1 = 0
    while(money >= 1000){
      if(money>50000)
        money = money - money*0.005
      else
        money -= 1000
      t1+=1
    }
    print("总共可以进过"+t1+"个路口")


  }
}
