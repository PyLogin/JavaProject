package com.itheima.create;

import java.util.SortedMap;

public class Demo4 {
    public static void main(String[] args) {
        //目标：掌握方法定义的其他类型
        judge(9);
    }

    public static void judge(int n) {

        if (n % 2 == 0) {
            System.out.println("这个数是偶数");
        } else {
            System.out.println("这个数是奇数");
        }

    }
}
