package com.athgb.chapter06

import scala.beans.BeanProperty


object homework001 {
  def main(args: Array[String]): Unit = {
    /*1、编写一个Time类，加入只读属性hours和minutes，
    和一个检查某一时刻是否早于另一时刻的方法before(other:Time):Boolean。Time对象应该以new Time(hrs,min)方式构建。*/
   val t1 = new Time(5,30)
   val t2 = new Time(5,40)
  println(t1.before(t2))

    /*2、创建一个Student类，加入可读写的JavaBeans属性name(类型为String)
    和id(类型为Long)。有哪些方法被生产？(用javap查看。)你可以在Scala中调用JavaBeans的getter和setter方法吗？*/

    println(new student().getName + "\t" + new student().getLong)
  }
  class student(){
    @BeanProperty
    var name ="hgb"
    @BeanProperty
    var long:Long = _
  }
  class Time(hrs:Byte,min:Byte){
    private val hours = this.hrs
    private val minutes = this.min

    def before(other:Time): Boolean ={
      if(other.hours < this.hours) {
          false
      }
      else if (other.hours > this.hours)
        true
      else
        if (other.hours < this.hours)
        false
      else
        true
    }
  }
}
