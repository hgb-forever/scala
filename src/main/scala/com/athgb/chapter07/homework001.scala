package com.athgb.chapter07

object homework001 {
  def main(args: Array[String]): Unit = {
  /*
  练习1编写Computer类，包含CPU、内存、硬盘等属性，getDetails方法用于返回Computer的详细信息编写PC子类，继承Computer类，
  添加特有属性【品牌brand】编写NotePad子类，继承Computer类，添加特有属性【颜色color】编写Test Object，在main方法中创建PC和NotePad对象，
  分别对象中特有的属性赋值，以及从Computer类继承的属性赋值，并使用方法并打印输出信息
  * */
    val computer = new Computer()
    val pc = new PC()
    val pad = new NotePad()
    computer.getDetails()
    println("pc_brand:"+pc.brand)
    println("notepad_color:"+pad.color)
  }
  class Computer{
    val CPU :String = "英特尔i7-9th"
    val memory : String = "8G"
    val disk : String = "256G"
    def getDetails(): Unit ={
      println("Cpu:"+this.CPU+"\t"+"memory:"+this.memory+"\t"+"disk:"+this.disk)
    }
  }
  class PC extends Computer{
    val brand : String ="戴尔"
  }
  class NotePad extends Computer{
    val color = "yellow"
  }
}
