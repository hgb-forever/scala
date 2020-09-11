package com.athgb.chapter14

object homework002 {
  def main(args: Array[String]): Unit = {
    /*1、利用模式匹配，编写一个swap函数，接受一个整数的对偶，返回对偶的两个组成部件互换位置的新对偶*/
//    println(swap(1,2))


    /*2、利用模式匹配，编写一个swap函数，交换数组中的前两个元素的位置，前提条件是数组长度至少为2*/
    /*val array = Array(1,2,3)
    swap2(array)
    println(array.mkString(" "))*/


    /*3、编写一个函数，计算List[Option[Int]]中所有非None值之和。不得使用match语句。*/
    val list1 =List[Option[Int]](Option(1),None,Option(2),Option(3),None)
      sum(list1)


  }
  def sum(list:List[Option[Int]]): Unit ={
    var num = 0
    list.map(x=>{
      if (!x.equals(None)) num += x.get
    })
    println(num)
  }


  def swap2(array: Array[Int]){
    array.length match {
      case x if x>=2 => {
        var t = array(0)
        array(0) = array(1)
        array(1) = t
      }
      case _ =>
    }
  }

  def swap(a:Int,b:Int):(Int,Int)={
    (a,b) match   {
      case (x, y) => (y, x)
    }
  }

}
