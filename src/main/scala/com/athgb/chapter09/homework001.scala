package com.athgb.chapter09

object homework001 {
  def main(args: Array[String]): Unit = {
    /*
    * 1、java.awt.Rectangle类有两个很有用的方法translate和grow,但可惜的是像java.awt.geom.Ellipse2D这样的类没有。
    * 在Scala中，你可以解决掉这个问题。定义一个RenctangleLike特质,加入具体的translate和grow方法。提供任何你需要用来实现的抽象方法,
    * 以便你可以像如下代码这样混入该特质:val egg = new java.awt.geom.Ellipse2D.Double(5,10,20,30) with RectangleLike
    egg.translate(10,-10)
    egg.grow(10,20)*/
    val egg = new java.awt.geom.Ellipse2D.Double(5,10,20,30) with RectangleLike {
      override val name = "hgb"
      override var age = 22.toByte
    }
    egg.translate(10,-10)
    egg.grow(10,2)
  }
}
trait RectangleLike{
  val name:String
  var age :Byte
  def translate(x:Byte,y:Byte): Unit ={
    println("我是translate")
  }
  def grow(x:Byte,y:Byte): Unit ={
    println("我是grow")
  }
}