package com.lanou3g;
import com.lanou3g.Person.Legs;

public class Main {
    public static void main(String[] args) {

        Goods goods = new Goods("水",11f,3);
        System.out.println(goods);

        //创建内部类Legs的对象
        //必须先有一个外部类的对象,才能创建内部类对象
        Person p = new Person();
        //一个外部类对象可以创建多个内部类对象
        Legs legs1 = p.new Legs();
        Legs legs2 = p.new Legs();
        Legs legs3 = p.new Legs();
        //内存泄漏
        //一个对象在该被回收的时候,没有被回收


        Person.Inner i = new Person.Inner();
        //一个类中都可能有什么东西
        /*
        1.静态代码块
        2.静态变量
        3.静态方法
        4.静态内部类
        5.代码块
        6.成员变量
        7.构造方法
        8.方法
        9.内部类
         */
    }
}
