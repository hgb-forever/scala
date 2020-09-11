package com.athgb.chapter01

object homework01 {
  /**
    * @param args
    */
  def main(args: Array[String]): Unit = {
    println("姓名s" + '\t' + "d年龄")
    print("ascas\tdgdfd")
    //    print("hgbs\t22\t福建\t腾里")
    //    print("\nxasd\tasdasd\tasd\t腾里岗小区")
    printf("\n%s\t%s\t%s", "姓名", "年龄", "籍贯")
    printf("\n%s\t%s\t%s", "国彪", "22", "福建\n")
    var name: String = "姓名"
    var age: String = "年龄"
    var location: String = "籍贯"
    var myname: String = "国彪"
    var myage: String = "22"
    var mylocation: String = "福建"
    println(s"$name\t$age\t$location")
    println(s"$myname\t$myage\t$mylocation")
    sum(1, 2)
  }

  /**
    * @author
    * hgb
    * @example
    * 输入n1,n2输出n1+n2
    * @version 1.0
    * @return 和
    * @param n1
    * @param n2
    */
  def sum(n1: Int, n2: Int): Int = {
    return n1 + n2
  }
}
