package com.athgb.chapter12

object exampleClass {
  def main(args: Array[String]): Unit = {
    abstract class Amount{
      val hgb = "hgb"
    }
    case class Dollar(value: Double) extends Amount
    case class Dollar2(value: Double)
    case class Currency(value: Double, unit: String) extends Amount
    case object NoAmount extends Amount

    val dollar = Dollar2(12.0)
    val dollar2 = Dollar2(30.0)
    println(dollar2.equals(dollar))
    //说明: 这里的 Dollar，Currencry, NoAmount  是样例类。
    for (amt <- Array(Dollar(1000.0), Currency(1000.0, "RMB"), NoAmount)) {
      val result = amt match {
        //说明
        case Dollar(v) => "$" + v
        //说明
        case Currency(v, u) => v + " " + u
        case NoAmount => ""
      }
      println(amt + ": " + result)
    }

    List(1, 3, 5, 9) match { //修改并测试
      //1.两个元素间::叫中置表达式,至少first，second两个匹配才行.
      //2.first 匹配第一个 second 匹配第二个, rest 匹配剩余部分(5,9)
      case first :: second :: rest => println(first , second  ,rest.length) //
      case _ => println("匹配不到...")
    }
    val list=List(6,9,2)
    println(list.sum)

  }
}
