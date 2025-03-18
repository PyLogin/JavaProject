package com.itheima.methodtask;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //需求：通过键盘录入两个整数m和n，n代表行数，m代表列数，打印@符号矩阵
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入行数：");
        int n = scanner.nextInt();
        System.out.print("请输入列数：");
        int m = scanner.nextInt();
        printMatrix(n, m);
    }

    public static void printMatrix(int n, int m) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print("@ ");
            }
            System.out.println();
        }
    }
}
