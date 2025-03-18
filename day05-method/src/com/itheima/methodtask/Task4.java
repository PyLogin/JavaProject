package com.itheima.methodtask;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        //需求：打印九九乘法表，键盘录入一个数，可以打印输入的乘法矩阵
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int num = scanner.nextInt();
        tables(num);
    }

    public static void tables(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + (i * j) + "\t");
            }
            System.out.println();
        }

    }
}
