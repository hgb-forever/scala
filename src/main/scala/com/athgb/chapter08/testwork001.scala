package com.athgb.chapter08
trait AA {
  println("A...")
}
trait BB extends  AA {
  println("B....")
}
trait CC extends  BB {
  println("C....")
}
trait DD extends  BB {
  println("D....")
}
class EE {
  println("E...")
}
class FF extends EE with CC with DD {
  println("F....")
}
class KK extends EE {
  println("K....")
}
object testwork001 {
  def main(args: Array[String]): Unit = {
    val ff1 = new FF()
    println(ff1)
    val ff2 = new KK() with CC with DD
    println(ff2)

  }
}
