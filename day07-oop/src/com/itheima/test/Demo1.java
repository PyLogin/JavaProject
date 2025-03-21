package com.itheima.test;

public class Demo1 {
    public static void main(String[] args) {
        // 需求：定义手机类实现手机两个功能，打印预期数据
//        Phone phone = new Phone();
//        phone.setColor("黑色");
//        phone.setBrand("小米手机");
//        phone.setPrice(3998);
//        phone.call();
//        phone.sendMessage();


        Girl girl = new Girl();
        girl.setName("凤姐");
        girl.setHeight(155);
        girl.setWeight(130);
        girl.show();
        girl.wash();
        girl.cook();
    }
}
