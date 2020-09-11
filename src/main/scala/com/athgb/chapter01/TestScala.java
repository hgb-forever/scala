package com.athgb.chapter01;


import scala.collection.Seq;
import scala.collection.mutable.ArrayBuffer;

import static jdk.nashorn.internal.objects.Global.print;
import static jdk.nashorn.internal.objects.Global.println;


public class TestScala {
    public static void main(String[] args) {
        System.out.println("姓名\t年龄\t籍贯\t住址");
        System.out. print("hgbs\t22\t福建\t腾里");
        System.out.print("\nxasd\tasdasd\tasd\t腾里岗小区");
        Hello$.MODULE$.main(args);
    }
}
final class Hello${
    public static final Hello$ MODULE$;
    static {
        MODULE$=new Hello$();
    }

    public static void main(String[] args) {
        System.out.println("Hello scala for idea");
        System.out.println("abc\ru");
    }
}