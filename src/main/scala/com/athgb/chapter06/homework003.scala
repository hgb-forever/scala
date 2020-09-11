package com.athgb.chapter06

object homework003 {
  import java.util.{HashMap=>JavaHashMap}
  import scala.collection.mutable.{HashMap=>ScalaHashMap}

  def main(args: Array[String]): Unit = {
    val javamap = new JavaHashMap[String,String]()
    javamap.put("name","hgb")
    javamap.put("age","12")
    javamap.put("sex","man")
    val scalamap= new ScalaHashMap[String,String]()
    for( key <- javamap.keySet().toArray){
      scalamap += (key.asInstanceOf[String] -> javamap.get(key))
    }
    println(scalamap.mkString(","))
    println(javamap.keySet())
  }
}
