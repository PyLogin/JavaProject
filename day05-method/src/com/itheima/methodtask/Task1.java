package com.itheima.methodtask;

public class Task1 {
    public static void main(String[] args) {
        //需求：定义一个方法，可以找出两个小数中较小的并返回
        double a = 9.6;
        double b = 9.6;
        System.out.println(getMin(a, b));
    }

    public static double getMin(double a, double b) {
        if (a < b) {
            return a;
        } else if (a > b) {
            return b;
        } else {
            return 0;
        }
    }
}
