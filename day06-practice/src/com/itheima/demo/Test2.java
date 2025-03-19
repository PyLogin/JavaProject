package com.itheima.demo;

public class Test2 {
    public static void main(String[] args) {
        //找出101-200之间的素数
        //素数：除了它和本身以外，不能被其他正整数整除，叫素数

        int count = 0;
        for (int i = 101; i <= 200; i++) {
            boolean flag = true;
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    //不是素数
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("101-200之间有" + count + "个素数");
    }

}
