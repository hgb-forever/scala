package com.athgb.porjectDemo001.CustomerService

import java.io._

import com.athgb.porjectDemo001.CostomerBean.Customer

import scala.collection.mutable.{ArrayBuffer, ListBuffer}
import scala.io.StdIn
import scala.runtime.BoxedUnit

class CustomerService {
  var list = ListBuffer[Customer](Customer(22, "hgb", 'm', "123", "123@16.com"), Customer(22, "hgb", 'm', "123", "123@16.com"),
    Customer(22, "dd", 'm', "123", "123@16.com"), Customer(22, "zz", 'm', "123", "123@16.com"))

  /**
    * @define 显示客户列表
    */
  def showList() {
    /*
    ---------------------------客户列表---------------------------
    编号  姓名       性别    年龄   电话            邮箱
     1    张三       男      30     010-56253825   abc@email.com
     2    李四       女      23     010-56253825    lisi@ibm.com
     3    王芳       女      26     010-56253825   wang@163.com
    -------------------------客户列表完成-------------------------

    * */

    println()
    println("---------------------------客户列表------------------------------")
    if (list.length < 1) {
      println("----------------------当前客户列表为空--------------------------")
    }
    else {
      println("编号\t\t姓名\t\t性别\t\t年龄\t\t电话\t\t邮箱")
      list.map(print)
    }
    println("---------------------------客户列表完成---------------------------")
    println()
  }

  /**
    * @define 添加一个客户
    */
  def add(): Unit = {
    /*
    * ---------------------添加客户---------------------
    姓名：张三
    性别：男
    年龄：30
    电话：010-56253825
    邮箱：zhang@abc.com
    ---------------------添加完成---------------------
*/
    println("---------------------添加客户---------------------")
    print("姓名:")
    val name = StdIn.readLine()
    print("性别:")
    val gender = StdIn.readChar()
    print("年龄:")
    val age = StdIn.readInt()
    print("电话:")
    val phone = StdIn.readLine()
    print("邮箱:")
    val email = StdIn.readLine()
    this.list.append(Customer(age, name, gender, phone, email))
    println("---------------------添加完成---------------------")
  }

  /**
    * @define 根据id删除客户
    * @return
    */
  def delete(): Boolean = {
    /*
    * ---------------------删除客户---------------------
      请选择待删除客户编号(-1退出)：1
      确认是否删除(Y/N)：y
      ---------------------删除完成---------------------
*/
    println("---------------------删除客户---------------------")
    print("请选择待删除客户编号(-1退出)：")
    var id = StdIn.readInt()
    if (id == -1) return false
    val cus = list.map(cus => if (cus.id == id) true else false)
    if (!cus.contains(true)) {
      println("       没有这个用户")
      return false
    }
    println("确认是否删除(Y/N)：")
    StdIn.readLine() match {
      case "Y" => {
        list.map(cus => {
          if (cus.id == id) list -= cus
        })
        println("---------------------删除完成---------------------")
        return true
      }
      case "N" => return false
    }

  }

  /**
    * @define 根据id更新客户信息
    */
  def update(): Unit = {
    /*
    * ---------------------修改客户---------------------
        请选择待修改客户编号(-1退出)：1
        姓名(张三)：<直接回车表示不修改>
        性别(男)：
        年龄(30)：
        电话(010-56253825)：
        邮箱(zhang@abc.com)：zsan@abc.com
        ---------------------修改完成---------------------
*/
    println("---------------------修改客户---------------------")
    print("    请选择待修改客户编号(-1退出)：")
    val id = StdIn.readInt()
    id match {
      case -1 => return
      case x => {
        var index = -1
        val cus: ListBuffer[Customer] = list.map(x => if (x.id == id) {
          index = list.indexOf(x)
          x
        }).asInstanceOf[ListBuffer[Customer]]
        if (list.length > 0 && index != -1) {
          println("<直接回车表示不修改>")
          print("姓名(" + cus(index).name + "):")
          val name = StdIn.readLine()
          print("性别(" + cus(index).gender + "):")
          val gender = StdIn.readChar()
          print("年龄(" + cus(index).age + "):")
          val age = StdIn.readInt()
          print("电话(" + cus(index).phone + "):")
          val phone = StdIn.readLine()
          print("邮箱(" + cus(index).email + "):")
          val email = StdIn.readLine()
          list(list.indexOf(cus(index))).update(age, name, gender, phone, email)
          println("---------------------修改完成---------------------")
        }
        else {
          println("       不存在该用户")
          return
        }
      }

    }

  }

  def Serializable(): Unit = {
    val out = new ObjectOutputStream(new FileOutputStream("CustomerList.obj"))
    out.writeObject(list)
    out.close()
    println("正在保存~~~~~")
    Thread.sleep(3000)
    println("保存成功!")
  }

  def readList(): Unit = {
    val file = new File("CustomerList.obj")
    if (!file.exists()) return
    val fileInput = new FileInputStream("CustomerList.obj")
    val in = new ObjectInputStream(fileInput)
    val readList = in.readObject().asInstanceOf[ListBuffer[Customer]]
    if (!readList.isEmpty) {
      println("正在读取文件内容~~")
      Thread.sleep(2000)
      println("文件读取成功！")
      this.list = readList
    } else println("-------正在初始化系统-------")
  }

  /**
    * @define 查询客户
    */
  def selectCus(): Unit = {
    println("------------------查询客户------------------")
    var loop = true
    print("请输入id或姓名(-1结束):")
    do {
      val keyword = StdIn.readLine()
      if (keyword.equals("-1")) return
      val regex ="""^\d+$""".r
      val flag = regex.findFirstMatchIn(keyword)
      flag match {
        case None => {
          var cusList = selectCusByName(keyword)
          if (!cusList.eq(null)) {
            cusList.filter((!_.isInstanceOf[Unit])).map(print)
            println("*******完成查询结果********")
          }
          else println("没有查询结果~")
        }
        case _ => {
          val id = flag.get.toString().toInt
          if (id == -1) {
            loop = false
            return
          }

          val cus = selectCusById(id)
          if (!cus.eq(null))
            print(cus)
          else println("没有查询结果~")
        }

      }
    } while (loop)

  }

  def selectCusById(id: Int): Customer = {
    var index = -1
    val cus: ListBuffer[Customer] = list.map(cus => if (cus.id == id) {
      index = list.indexOf(cus)
      cus
    }).asInstanceOf[ListBuffer[Customer]]
    if (index == -1) {
      return null
    }
    cus(index)
  }

  def selectCusByName(name: String): ListBuffer[Customer] = {
    var index = ArrayBuffer[Int]()
    var cusList = ListBuffer[Customer]()
    val cus: ListBuffer[Customer] = list.map(x => if (x.name.contains(name)) {
      index += list.indexOf(x)
      x
    }).asInstanceOf[ListBuffer[Customer]]
    for (i <- index) {
      if (!cus(i).isInstanceOf[Unit])
        cusList.append(cus(i))
    }
    if (cusList.isEmpty)
      return null
    else cusList
  }

}
