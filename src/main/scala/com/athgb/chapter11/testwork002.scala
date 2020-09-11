package com.athgb.chapter11

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object testwork002 {
  def main(args: Array[String]): Unit = {
    /*val list =List(3,4,2,7,5)
    val list2 = list.reduceLeft(min)
    println(list2)*/

  /*  val sentence = "AAAAAAAAAABBBBBBBBCCCCCDDDDDDD"
    println(sentence.foldLeft(new ArrayBuffer[Char]())(handle))*/

    /*val sentence = "AAAAAAAAAABBBBBBBBCCCCCDDDDDDD"
     使用映射集合，统计一句话中，各个字母出现的次数
     提示：Map[Char, Int]()*/
    /*val sentence = "AAAAAAAAAABBBBBBBBCCCCCDDDDDDD"
    println(sentence.foldLeft(Map[Char,Int]())(count))
    var map = mutable.Map[Char,Int]()
    sentence.foldLeft(map)(count)
    println(map)*/


    /*
    val lines = List("atguigu han hello ", "atguigu han aaa aaa aaa ccc ddd uuu")
     使用映射集合，list中，各个单词出现的次数，并按出现次数排序
     */
    val lines = List("atguigu han hello ", "atguigu han aaa aaa aaa ccc ddd uuu")
    println("atguigu han hello ".split(" ").length)
    println(lines.foldLeft(mutable.Map[String,Int]())(listCount).toList.sortBy(_._2).reverse)

  }
  def listCount(map: mutable.Map[String,Int],c:String):mutable.Map[String,Int]={
    var s=c.split(" ")
    for (i <- s)
     map += ( i -> (map.getOrElse(i,0)+1))
    map
  }
  def count(map: mutable.Map[Char,Int], c:Char): mutable.Map[Char,Int] ={
    map += (c -> (map.getOrElse(c,0)+1))
  }
  def count(map: Map[Char,Int],c:Char): Map[Char,Int] ={
    map + (c -> (map.getOrElse(c,0)+1))
  }

  def handle(arrayBuffer: ArrayBuffer[Char],c:Char): ArrayBuffer[Char] ={
    arrayBuffer.append(c)
    arrayBuffer
  }

  def min(a:Int,b:Int):Int={
    if(a<b)a else b
  }
}
