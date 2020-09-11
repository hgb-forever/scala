package com.athgb.chapter08

trait  Operate5 {
   def insert(id : Int)
}
trait File5 extends Operate5 {
  override def insert(id: Int): Unit = {
    println("将数据保存到文件中..")
  }
}
