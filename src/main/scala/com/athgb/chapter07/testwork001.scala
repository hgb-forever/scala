package com.athgb.chapter07

object testwork001 {
  def main(args: Array[String]): Unit = {
    val student = new Student("hgb")
    student.sum()
  }

  class  Person(pname:String,page:Int){
    var name = this.pname
    var age = this.page
    println("Person~")
    def sum(): Unit ={
      println("sum()~~")
    }
    def this(){
      this("hgb",12)
      println("Person无惨")
    }
    def this(name:String){
      this(name,12)
      println("Person一个参数")
    }
  }
  class Student(name:String) extends  Person(name){
    override def sum(): Unit ={
      println("student.sum()~~")
      super.sum()
    }
  }
}
