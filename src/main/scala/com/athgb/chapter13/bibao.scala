package com.athgb.chapter13

object bibao {
  def main(args: Array[String]): Unit = {
    def makeSuffix(mysuffix: String)={
      (suffix:String) =>
      {
        if(suffix.endsWith(mysuffix))
          suffix
        else
          suffix + mysuffix
      }
    }
    val mySuffix = makeSuffix(".html")
    val s = mySuffix("hgb")
    val h = mySuffix("asda.jpg")
    println(s)
    println(h)

  }
}
