package com.itheima.overload;

import javax.sound.sampled.FloatControl;

public class Demo1 {
    public static void main(String[] args) {
        //目标：学会方法重载的书写技巧
        //好处：使用方法重载，可读性好:
        fire();


    }

    public static void fire() {
//        System.out.println("默认发送一枚武器");
        fire("岛国");
    }

    public static void fire(String location) {
//        System.out.println("向" + location + "发射一枚导弹");
        fire(location, 1);
    }

    public static void fire(String location, int num) {
        System.out.println("向" + location + "发射" + num + "导弹");
    }
}
