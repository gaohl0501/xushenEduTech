package com.xushen.test;

/**
 * Created by sh00974 on 2018/3/8.
 */
public class StaticTest {
    public static void main(String[] args)
    {
        System.out.println("Hello");
    }



    {
        System.out.println("2");
    }

    static
    {
        System.out.println("b="+StaticTest.b);
        System.out.println("1");
    }
    static int b =112;
//    static StaticTest st = new StaticTest();

    StaticTest()
    {
        System.out.println("3");
        System.out.println("a="+a+",b="+b);
    }

    public static void staticFunction(){
        System.out.println("4");
        System.out.println("b="+b);
    }

    int a=110;

}
/**
 * 3.静态代码块
 * 4.静态属性赋值
 * 1.非静态代码块。
 * 2.非静态属性值。
 *
 * 5.构造方法。
 * 4.main方法
 *
 **/