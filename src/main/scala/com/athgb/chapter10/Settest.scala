package com.athgb.chapter10

object Settest {
  def main(args: Array[String]): Unit = {
    val set01 = Set("hgb","gg","cc","abc")
    println(set01)
    import scala.collection.mutable
    val set02 = mutable.Set(1,2,4,"abc",9,5)
    println(set02)
    set02.add(90)
    set02 += 78
    set02.+= (90)
    println(set02)
    set02 -= 2 // 操作符形式
    set02.remove("abc") // 方法的形式，scala的Set可以直接删除值
    println(set02)

    println(set01.max)
//    println("max="+set02.max+"\n min="+set02.min)
  }
}
