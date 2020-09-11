package com.athgb.chapter04

import scala.io.StdIn
import scala.reflect.internal.util.StringOps

object homework001 {
  def main(args: Array[String]): Unit = {
//    1、一个数字如果为正数，则它的signum为1;如果是负数,则signum为-1;如果为0,则signum为0.编写一个函数来计算这个值
   /* val n = StdIn.readInt()
    println("第一题:"+ signum(n))*/

//    2、一个空的块表达式{}的值是什么？类型是什么？
//     （） Unit类型
//    3、针对下列Java循环编写一个Scala版本:
//    for(int i=10;i>=0;i--)System.out.println(i);
    /*for(i <- Range(10,0,-1)){
      println(i)
    }*/
//    (0 to 10).reverse.foreach(println)

//    4、编写一个过程countdown(n:Int)，打印从n到0的数字
    /*val n1 = StdIn.readInt()
    countdown(n1)*/

//    5、编写一个for循环,计算字符串中所有字母的Unicode代码（toLong方法）的乘积。举例来说，"Hello"中所有字符串的乘积为9415087488L
    /*val s1 = "Hello"
    var sum = 1L
    for( i <- s1){
      sum*=i
    }
    println("sum="+sum)*/

//    6、同样是解决前一个练习的问题，请用StringOps的foreach方式解决。
    /*var res = 1L
    "Hello".foreach(res*=_.toLong)*/
    /*val s1 = "Hello"
    var sum = 1L
    s1.foreach(item=>{
      sum*=item
    })
    println("sum="+sum)*/

//    7、编写一个函数product(s:String)，计算字符串中所有字母的Unicode代码（toLong方法）的乘积

//    product("Hello")

//    8、把7练习中的函数改成递归函数
//  print(diguiproduct("Hello"))

//    9、编写函数计算,其中n是整数，使用如下的递归定义:
//     = x*,如果n是正数的话
//     = 1
//     = 1/,如果n是负数的话
//    不得使用return语句
//  println(t2(-2))
  }

  /**
    * @example 递归返回x的n次方
    * @param n
    * @return
    */
  def  t2(n:Int): Double ={
    if(n == 0)
      1
    else if(n>0){
    t2(n-1)*n
    }else{
      1/t2(-n)
    }
  }

  /**
    * @example 递归返回字符串的Unicode编码的乘积
    * @param s
    * @param i
    * @return
    */
  def diguiproduct(s:String,i:Int=0): Long ={
    if(i>s.length-1)
    1L
    else
      s.charAt(i)*diguiproduct(s,i+1)

  }
  /**
    * @return 返回字符串的Unicode码乘积
    * @param s
    */
  def product(s:String): Unit ={
    var sum = 1L
    s.foreach(item=>{
      sum*=item
    })
    println("sum="+sum)
  }
  /**
    *@example
    * @param n
    * @return 判断n是正负数或0
    */
  def signum(n:Int): Int ={
    if(n > 0)
      1
    else if(n < 0)
      -1
    else
      0
  }

  /**
    *@return 返回n到0的数
    * @param n
    */
  def countdown(n:Int){
    for(i <- Range(n,0,-1) )
    println(i)
  }
}
