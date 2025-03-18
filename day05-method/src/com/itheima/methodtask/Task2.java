package com.itheima.methodtask;

public class Task2 {
    public static void main(String[] args) {
        //需求：定义一个方法可以找出三个整数中最大的数并返回
        int a = 1;
        int b = 1;
        int c = 1;
        System.out.println(getMax(a, b, c));
    }

    public static int getMax(int a, int b, int c) {
        int max = a > b ? (a >c ? a: c  ) : (b > c ? b: c);
        return max;
    }
}
