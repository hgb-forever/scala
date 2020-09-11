package com.athgb.chapter12

object MatchObject extends App{
  object Square {
    def unapply(z: Double): Option[Double] = Some(math.sqrt(z))
    def apply(z: Double): Double = z * z
  }
  // 模式匹配使用：
  val number: Double = 36.0
  number match {
    case Square(n) => println(n)
    case _ => println("nothing matched")
  }
  object Names {
    def unapplySeq(str: String): Option[Seq[String]] = {
      if (str.contains(",")) Some(str.split(","))
      else None
    }}
  val namesString = "Alice,Bob,Thomas"
  //说明
  namesString match {
    case Names(first, second, third) => {
      println("the string contains three people's names")
      // 打印字符串
      println(first+ second +third)
    }
    case _ => println("nothing matched")
  }

}
