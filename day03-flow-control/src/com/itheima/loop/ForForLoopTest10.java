package com.itheima.loop;

public class ForForLoopTest10 {
    public static void main(String[] args) {
        //需求：使用*打印出4行5列的矩形
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
