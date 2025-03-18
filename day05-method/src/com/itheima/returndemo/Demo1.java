package com.itheima.returndemo;

public class Demo1 {
    public static void main(String[] args) {
        //目标：掌握return 关键字的作用
        divide(6,6);
    }

    public static void divide(int a, int b) {
        if (b == 0) {
            System.out.println("除数不能为零");
            return;
        }
        int c = a / b;
        System.out.println(a + "/" + b + "=" + c);
    }
}
