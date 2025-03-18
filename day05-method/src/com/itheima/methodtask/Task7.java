package com.itheima.methodtask;

public class Task7 {
    public static void main(String[] args) {
        //需求：对小数进行四舍五入
        double num = 3.54;
        int abs = round(num);
        System.out.println(num + "四舍五入后是：" + abs);
    }

    public static int round(double num) {
        int a = (int) (num * 10) % 10;
        if (a < 5) {
            return (int) num;
        } else {
            return (int) num + 1;
        }
    }
}
