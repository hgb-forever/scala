package com.athgb.porjectDemo001.app

import com.athgb.porjectDemo001.CustomerService.{CustomerService}
import com.athgb.porjectDemo001.CustomerView.Menu

import scala.io.StdIn

object appInter {
  def main(args: Array[String]): Unit = {
    val view = new Menu()    //调用前台接口
    val service = new CustomerService()  //调用后台用户列表接口
    var loop = true                 //设置菜单循环变量

    service.readList()
    while(loop)
    {
      view.mainMenu()
      try {
        val flag = StdIn.readInt()
        flag match {
          case 1 => service.add()
          case 2 => service.update()
          case 3 => service.delete()
          case 4 => service.showList()
          case 5 => service.selectCus()
          case 6 => {
            service.Serializable()
            loop = false
          }
          case _ => println("****************请输入正确的数字****************")
        }
      }catch{
        case ex:java.lang.NumberFormatException =>{
          println("****************请输入正确的命令****************")
        }
      }

    }
  }
}
