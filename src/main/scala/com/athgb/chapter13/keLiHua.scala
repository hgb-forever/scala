package com.athgb.chapter13

object keLiHua {
  def main(args: Array[String]): Unit = {
    def eq(s1: String, s2: String): Boolean = {
      s1.equals(s2)}
    implicit class TestEq(s: String) {
      def checkEq(ss: String)(f: (String, String) => Boolean): Boolean = {
        f(s.toLowerCase, ss.toLowerCase)
      }}

    val str1 ="Hgb"
    val str2 = "hgB"
    //案例演示+说明+简化版(三种形式，直接传入匿名函数方式)
    println(str1.checkEq(str2)(eq))
  }
}
