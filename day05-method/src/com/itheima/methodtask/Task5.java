package com.itheima.methodtask;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        //需求：通过键盘录入，从大到小依次打印三个数
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入第一个整数：");
        int a = scanner.nextInt();
        System.out.print("请输入第二个整数：");
        int b = scanner.nextInt();
        System.out.print("请输入第三个整数：");
        int c = scanner.nextInt();
        maxToMin(a, b, c);

    }

    public static void maxToMin(int a, int b, int c) {
        int max = a > b ? (a > c ? a : c) : (b > c ? b : c);
        int min = a < b ? (a < c ? a : c) : (b < c ? b : c);
        int sum = a + b + c;
        int mid = sum - max - min;
        System.out.println("从大到小的顺序是：" + max + " " + mid + " " + min);

    }
}
