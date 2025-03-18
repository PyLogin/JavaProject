package com.itheima.methodtask;

public class Task6 {
    public static void main(String[] args) {
        //需求：定义一个方法对负数进行去反，并返回
        double num = -3.14;
        double result = invert(num);
        System.out.println(result);
    }

    public static double invert(double a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}
