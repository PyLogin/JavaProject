package com.itheima.thisdemo;

import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        // 目标：掌握this关键字
        Car car = new Car();
        car.drive();
        System.out.println("当前对象" + car);
        car.name = "奔驰";
        car.price = 39.8;

        car.goWith("宝马");
        Random rd = new Random();
        rd.nextInt(19);

    }
}
