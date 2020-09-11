package com.athgb.chapter13

object controlClass {
  def main(args: Array[String]): Unit = {
    var x = 10
    def until(condition: => Boolean)(block: => Unit): Unit = {
      //类似while循环，递归
      if (!condition) {
        block
        until(condition)(block)
      }
      //      println("x=" + x)
      //      println(condition)
      //      block
      //      println("x=" + x)
    }

//    until(x == 0) {
//      x -= 1
//      println("x=" + x)
//    }

    def myRunInThread(f1:  => Unit): Unit = {//说明
      new Thread {
        override def run(): Unit = {
          f1
        }
      }.start()
    }
    myRunInThread { //说明
      println("干活咯！5秒完成...")
      Thread.sleep(5000)
      println("干完咯！")
    }
  }
}
