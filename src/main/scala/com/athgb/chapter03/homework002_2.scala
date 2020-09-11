package com.athgb.chapter03

object homework002_2 {
  def main(args: Array[String]): Unit = {
    for(i <- 1 to 9){
      for(j <- 1 to i){
        print(j + "*" + i + "=" + (i*j) + "\t")
      }
      if(i!=9)
      println()
    }
  }
}
