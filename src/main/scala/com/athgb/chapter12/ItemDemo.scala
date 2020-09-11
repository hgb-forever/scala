package com.athgb.chapter12

object ItemDemo {
  def main(args: Array[String]): Unit = {
    abstract class Item // 项

    case class Book(description: String, price: Double) extends Item
    //Bundle 捆 ， discount: Double 折扣 ， item: Item* ,
    case class Bundle(description: String, discount: Double, item: Item*) extends Item

    val sale = Bundle("书籍", 10,  Book("漫画", 40), Bundle("文学作品", 20, Book("《阳关》", 80), Book("《围城》", 30)))
    val res = sale match  {
      //如果我们进行对象匹配时，不想接受某些值，则使用_ 忽略即可，_* 表示所有
      case Bundle(_, dis, Book(desc, _), _*) => desc+"书的折扣是"+dis+"￥"
    }
    println(res)

    val sale2 = Bundle("书籍", 10,  Book("漫画", 40), Bundle("文学作品", 20, Book("《阳关》", 80), Book("《围城》", 30)),
      Bundle("体育", 20, Book("《NBA快讯》", 80), Book("《体育前沿》", 30)))
    val result2 = sale2 match {
      case Bundle(_, _, art @ Book(_, _), rest @_*) => (art, rest)
    }
    println(result2)
    println("art =" + result2.productElement(0))
    println("rest=" + result2._2)
    println(price(sale2))
    def price(it: Item): Double = {
      it match {
        case Book(_, p) => p
        //生成一个新的集合,_是将its中每个循环的元素传递到price中it中。递归操作,分析一个简单的流程
        case Bundle(_, disc, its @ _*) => its.map(price _).sum - disc
      }
    }
  }

}
