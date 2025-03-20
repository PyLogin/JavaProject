package com.itheima.create;


public class Demo1 {
    public static void main(String[] args) {
        // 掌握面向对象编程，如何设计类、创建类的对象并使用
        // 1、设计类
        // 2、创建类的对象
        Car c = new Car();
        c.carName = "宝马";
        c.carPrice = 39.9;

        Car c2 = new Car();
        c2.carName = "奔驰";
        c2.carPrice = 38.9;

        c.run();
        c2.run();
    }

}
