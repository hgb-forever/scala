package com.athgb.chapter13

import scala.collection.mutable.ListBuffer

object testwork001 {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4,5,6,7, "abc")
    var list2=ListBuffer[Int]()
    for (item <- list){
      item match {
        case x:Int =>list2 += (x+1)
        case _:String =>
      }
    }
    println(list2.toList)
    var list3 = list.map(newList)
    println(list3)

    val list5 = List(1, 2, 3, 4, "abc")
    //说明
    val addOne3= new PartialFunction[Any, Int] {
      def isDefinedAt(any: Any) = any.isInstanceOf[Int]
      def apply(any: Any) = any.asInstanceOf[Int] + 1
    }
    val list6 = list5.collect(addOne3)
    println("list3=" + list6)

  }

  def newList(n:Any):Any={
    n match {
      case x:Int =>x+1
      case _ =>
    }
  }
}
