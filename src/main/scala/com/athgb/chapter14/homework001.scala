package com.athgb.chapter14

import scala.runtime.Nothing$
import scala.xml.Null
object homework001 {
  def main(args: Array[String]): Unit = {
      implicit class newPair( pair: Pair4[Any,Any]){
          def swap(f:(Any,Any)=>Boolean): Pair4[Any,Any]={
            if(f(pair.a,pair.b))

              new Pair4[Any,Any](this.pair.b,pair.a)
            else
              null
          }
      }
    def judge(a:Any,b:Any): Boolean ={

       a.getClass.getSimpleName == b.getClass.getSimpleName
    }

    /*1、定义一个不可变类Pair[T,S], 带一个swap方法，返回组件交换过位置的新对偶*/
    /*val unit = Pair[String,Int]("hgb",22)
    val unit1 = unit.swap()
    println("unit="+unit.a+"\t"+unit.b)
    println("unit1="+unit1.a+"\t"+unit1.b)*/

    /*2、定义一个可变类Pair[T]，带一个swap方法，交换对偶中组件的位置。*/
    /*val unit = Pair2[String]("hgb","forever")
    val unit1 = unit.swap()
    unit.a = "666"
    println("unit="+unit.a+"\t"+unit.b)
    println("unit1="+unit1.a+"\t"+unit1.b)*/


    /*3、给定类Pair[T, S] ，编写一个泛型方法swap，接受对偶作为参数并返回组件交换过位置的新对偶。*/
    /*val unit = Pair3[String,Int]()
    val unit1 = unit.swap("hgb",22)
    println("unit="+unit.a+"\t"+unit.b)
    println("unit1="+unit1.a+"\t"+unit1.b)*/


    /*4、给定可变类Pair[S,T]，使用类型约束定义一个swap方法，当类型参数相同时可以被调用。*/

    val unit =Pair4[Any,Any]("hgb",123)
    val unit1 = unit.swap(judge)
    println("unit="+unit.a+"\t"+unit.b)
    println("unit1="+unit1)

  }

  case class Pair4[T,S](var a:T,var b:S)

  case class Pair3[T,S]() {
    var a:T=_
    var b:S =_
    def this( a:T, b:S){
      this
      this.a = a
      this.b = b
    }
    def swap( a:T, b:S): Pair3[S,T] ={
      new Pair3[S,T](b,a)
    }
  }

  case class Pair2[T](var a:T,var b:T) {

    def swap(): Pair2[T] ={
      new Pair2[T](b,a)
    }
  }





  case class Pair[T,S](a:T,b:S) {
    def swap(): Pair[S,T] ={
      new Pair[S,T](b,a)
    }
  }
}
