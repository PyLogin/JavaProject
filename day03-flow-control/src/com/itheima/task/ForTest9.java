package com.itheima.task;

public class ForTest9 {
    public static void main(String[] args) {
        //需求：控制台打印五行三角形
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
