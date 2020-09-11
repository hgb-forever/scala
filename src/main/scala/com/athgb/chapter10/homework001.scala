package com.athgb.chapter10

import scala.collection.mutable.{ArrayBuffer, ListBuffer}

object homework001 {
  def main(args: Array[String]): Unit = {
    /*1、编写一段代码，将a设置为一个n个随机整数的数组，要求随机数介于0和n之间。*/
    /* val a=new Array[Int](randomInt)
    for (i <- a)
    println(i)*/

    /*2. 编写一个循环，将整数数组中相邻的元素置换。比如Array(1, 2, 3, 4, 5)置换后为Array(2, 1, 4, 3, 5)*/
   /* var array = Array(1,2,3,4,5)
    for (i <- Range(0,array.length,2);if (i+1<array.length)) {
      var t =0
      t = array(i+1)
      array(i+1) = array(i)
      array(i) =t
    }
    for (i <- array)
      println(i)*/

    /*3. 给定一个整数数组，产出一个新的数组，包含原数组中的所有正值，以原有顺序排列，之后的元素是所有零或负值，以原有顺序排列。*/
   /* var array = Array(1,2,9,4,5,0,-1,-5)
    var array2 = new Array[Int](array.length)
    var num = 0
    for (i <- array if i>0){
        array2(num) = i
         num += 1
    }
    for (i <- array2)
      println(i)*/


    /*4、设置一个映射，其中包含你想要的一些装备，以及它们的价格。然后根据这个映射构建另一个新映射，采用同一组键，但是价格上打9折。*/

    /*var map1 = Map(("魔剑" -> 1000),("天启者杰斯" ->45),("K/DA 卡莎" -> 99),("改名卡" -> 45))
    for (i <- map1.keys)
      {
       map1 += (i -> (map1.getOrElse(i,0)*0.9).toInt)
      }
    println(map1)*/

  /*5、编写一个函数 minmax(values:Array[Int]), 返回数组中最小值和最大值的对偶*/
    /*var array = Array[Int](1,2,5,4,9,5,-1)
    println(minmax(array))*/

    /*6、编写一个函数，从一个整型链表中去除所有的零值*/
    /*val list = ListBuffer(0,1,2,0,0,0,0,3,0,0,5,0)
    handle(list)
    println(list)*/


    /*7、编写一个函数，接受一个字符串的集合，以及一个从字符串到整数值的映射。返回整形的集合，
    其值为能和集合中某个字符串相对应的映射的值。举例来说，给定Array(“Tom”,”Fred”,”Harry”)
    和Map(“Tom”->3,”Dick”->4,”Harry”->5)，返回Array(3,5)。提示：用flatMap将get返回的Option值组合在一起。
    */
    /*val array = Array("Tom","Fred","Harry")
    var map = Map("Tom"->3,"Dick"->4,"Harry"->5)
    map += ("HGB" -> 60)
    array.update(1,"HGB")
    println(getArray(array,map))*/

  /*8、实现一个函数，作用与mkStirng相同，提示：使用reduceLeft实现试试*/

    /*val result = (Map[Char,Int]() /: "Mississippi"){
      (m,c) => m + (c -> (m.getOrElse(c, 0)+1))
    }
    println(result)

    var array = Array("Tom","Fred","Harry")
    println(array.foldLeft("8")(_+"->"+_))
    val res = ("8" /: Array("Tom","Fred","Harry")){
      (list1,list2)=> list1 +"->"+ list2
    }
    println(res)*/
    /*var array = Array("Tom","Fred","Harry")
    println(myString(array,"----"))*/

    /*9、给定整型列表lst，(lst :\ List[Int]())(_ :: _)得到什么? (List[Int]() /: lst)(_ :+ _)又得到什么？
    如何修改他们中的一个，以对原列表进行反向排列?*/
    /*val list1 = List[Int](1,2,3)
    var list2 = List[Int](9,4,9)
    list2 ++= list1
    println(list2 )
    println((List[Int]() :\ list1.reverse)(_ :: _))
    println((List[Int](4) /: list1)(_ :+ _))*/



    /*10、编写一个函数，将Double数组转换成二维数组。传入列数作为参数。距离来说，
    传入Array(1,2,3,4,5,6)和3列，返回Array(Array(1,2,3), Array(4,5,6))。*/
    val array1 = Array[Double](1,2,3,4,5,6)
    var list1 =new Array[Array[Double]](array1.length/3)
    for (i <- 0 until (array1.length/3)){
      val list2 = new Array[Double](3)
      for (j <- 0 until 3){
        list2(j)=array1(i*3+j)
      }
      list1(i) = list2
    }
    for (i <- list1)
        println(i.mkString("\t"))
//    var result:ArrayBuffer[Any]=doubleToer(array1,3)
//    for (i <- list1)
//      println(i.getClass.toString)


    def doubleToer(array: Array[Double],column:Int): Array[Any]= {
      var list1 = Array[Any](array.length/column)
      for (i <- 0 until (array.length/column)){
        val list2 = Array[Double](column)
        for (j <- 0 until column){
          list2(j)=array(i+j)
        }
        list1(i) = list2
      }
      list1
    }










    def myString(array:Array[String],seq : String):String={
      array.reduceLeft(_+seq+_).toString
    }




    def getArray(array: Array[String],map: Map[String,Int]): ArrayBuffer[Any] ={
      var list = ArrayBuffer[Any]()
      for (i <- map.keys)
        for (j <-array){
          if(j == i)
            list += List(array.indexOf(j) ,map.getOrElse(i,0))
        }
  return list
    }








    def handle(list:ListBuffer[Int]) {
      for(i <- list)
        {
          if(i==0)
            list -= i
        }
    }







    def minmax(value:Array[Int]): Tuple2[Int,Int] ={
      return Tuple2(value.min,value.max)

    }

    def randomInt(): Int ={
      return (Math.random()*10).toInt
    }
  }
}
