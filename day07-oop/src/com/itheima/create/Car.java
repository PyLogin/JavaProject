package com.itheima.create;

public class Car {
    //属性
    String carName;
    double carPrice;

    //行为
    public void start() {
        System.out.println(carName + "启动了");
    }

    public void run() {
        System.out.println("名字是" + carName + "，价格是" + carPrice + "跑起来了");
    }


}
