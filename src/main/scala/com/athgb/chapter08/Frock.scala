package com.athgb.chapter08

class Frock{
  var serialNumber=Frock.getNextNum()
}
object Frock {
  var currentNum = 100000
  def getNextNum(): Int ={
    this.currentNum+= 100
    return this.currentNum
  }
  def main(args: Array[String]): Unit = {
    val frock1 = new Frock()
    val frock2 = new Frock()
    val frock3 = new Frock()
    println(frock1.serialNumber+"\t"+frock2.serialNumber+"\t"+frock3.serialNumber)
    val frock4 = new Frock() with File5
    frock4.insert(5)
    /*在Frock类中声明私有的静态属性currentNum，初始值为100000，作为衣服出厂的序列号起始值。
    声明公有的静态方法getNextNum，作为生成上衣唯一序列号的方法。每调用一次，将currentNum增加100，并作为返回值。
    在TestFrock类的main方法中，分两次调用getNextNum方法，获取序列号并打印输出。
    在Frock类中声明serialNumber(序列号)属性，并提供对应的get方法；
    在Frock类的构造器中，通过调用getNextNum方法为Frock对象获取唯一序列号，赋给serialNumber属性。
    在TestFrock类的main方法中，分别创建三个Frock 对象，并打印三个对象的序列号，验证是否为按100递增。
    * */
  }
}
