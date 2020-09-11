package com.athgb.chapter03

import scala.io.StdIn
import util.control.Breaks._
object homework002_4 {
  def main(args: Array[String]): Unit = {
    val admin = "张无忌"
    val password = "888"
    breakable {
      for (i <- 1 to 3) {
        printf("请输入用户名:\n")
        val myname = StdIn.readLine()
        printf("请输入密码:\n")
        val mypassword = StdIn.readLine()
        if (admin.equalsIgnoreCase(myname) && password.equalsIgnoreCase(mypassword)) {
          println("登录成功！")
          break()
        }
        else if (i != 3)
          printf("你还有%d次机会~", 3 - i)
      }
    }
  }
}
