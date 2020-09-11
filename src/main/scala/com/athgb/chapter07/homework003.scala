package com.athgb.chapter07

object homework003 {
  def main(args: Array[String]): Unit = {
    /*
    * 定义员工类Employee，包含姓名和月工资，以及计算年工资getAnnual的方法。普通员工和经理继承了员工，
    * 经理类多了奖金bonus属性和管理manage方法，普通员工类多了work方法，普通员工和经理类要求分别重写getAnnual方法
    * 测试类中添加一个方法showEmpAnnal，实现获取任何员工对象的年工资,并在main方法中调用该方法测试类中添加一个方法，
    * testWork,如果是普通员工，则调用work方法，如果是经理，则调用manage方法 【10min】*/
    val employee = new Employee("hgb001",1000)
    val common = new Common("hgb002",2000)
    val manager = new Manager("hgb003",5000,10000)
    val test001 = new test(employee)
    test001.showEmpAnnal()
    test001.testWork()
    val test002 = new test(common)
    test002.showEmpAnnal()
    test002.testWork()
    val test003 = new test(manager)
    test003.showEmpAnnal()
    test003.testWork()

  }
  class test(e:Employee){
    def showEmpAnnal(): Unit ={
      e.getAnnual()
    }
    def testWork(): Unit ={
      if(e.isInstanceOf[Common])
        e.asInstanceOf[Common].work()
      else if(e.isInstanceOf[Manager])
        e.asInstanceOf[Manager].manage()
      else
        println("我是个混子")
    }
  }
  class Employee(ename:String,emoney:Short){
    val name :String = this.ename
    var money:Short = this.emoney
    def getAnnual(): Unit ={
      println(this.name+"的年工资为:"+this.money*12)
    }
  }
  class Common(cname:String,cmoney:Short) extends Employee(cname,cmoney){
    def work(): Unit ={
      println("员工在work")
    }

    override def getAnnual(): Unit = {
      super.getAnnual()
      println("员工重写了getAnnual")
    }
  }
  class Manager(mname:String,mmoney:Short,mbonus:Short) extends Employee(mname,mmoney){
    var bonus = this.mbonus
    def manage(): Unit ={
      println("经理在manage")
    }

    override def getAnnual(): Unit = {
      println(this.name+"的年工资为:"+(this.money*12+this.bonus))
      println("经理重写了getAnnual")
    }
  }
}
