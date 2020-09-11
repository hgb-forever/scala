package com.athgb.chapter08

object homework002 {
  def main(args: Array[String]): Unit = {
  val rectangle = new Rectangle()
    val circle = new Circle()
    rectangle.centerPoint()
    circle.centerPoint()
    val square = new Square(0,0,4)
    println(square.x)
    println(square.y)
    println(square.width)
    println(square.height)
  }
}
abstract class Shape{
  def centerPoint(){}
}
class Rectangle extends Shape{
  override def centerPoint(): Unit = {
    println("Rectangle~")
  }
}
class  Circle extends Shape{
  override def centerPoint(): Unit = {
    println("Circle~")
  }
}

class Square(x:Short,y:Short,width:Short) extends java.awt.Rectangle(x,y,width,width){
  def this(width:Short){
    this(0,0,width)
  }
  def this(){
    this(0,0,0)
  }
}