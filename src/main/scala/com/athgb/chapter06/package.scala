package com.athgb {

  package object homework002 {
  var name = "hgb"

    def sum(): Unit ={
      println("ok")
    }
  }
  package  homework002{
    class teacher{
      val tid = 20
      def home(): Unit ={
        sum()
      }
    }
    object my{
      def main(args: Array[String]): Unit = {
        new teacher().home()
      }
    }
  }

}