package com.athgb.chapter03

import scala.io.StdIn

object homework002 {
  def main(args: Array[String]): Unit = {
    //classGrade 班级的成绩
    //classNum 班级数量
    //stuGrade  学生的成绩
    //stuNum 学生数量
    //allGrade  所有人的成绩
    var classNum = 3
    var stuNum = 5
    var stuGrade = 0.0
    var classGrade = 0.0
    var allGrade = 0.0
    var pass = 0
    for(i <- 1 to classNum){
      for(j <- 1 to stuNum){
        printf("请输入第%d个班级的，第%d个学生的成绩：\n",i,j)
        stuGrade = StdIn.readDouble()
        classGrade += stuGrade
        if(stuGrade >= 60)
          pass += 1
      }
      allGrade += classGrade
      printf("第%d个班级的平均分为:%.2f\n",i,classGrade/stuNum)
      classGrade = 0.0
    }
    printf("全部班级的平均分为:%.2f\n",allGrade/classNum/stuNum)
    printf("及格人数为%d",pass)
  }
}
