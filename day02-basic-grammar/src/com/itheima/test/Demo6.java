package com.itheima.test;

import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入和尚1的身高");
        int h1 = sc.nextInt();
        System.out.println("请输入和尚2的身高");
        int h2 = sc.nextInt();
        System.out.println("请输入和尚3的身高");
        int h3 = sc.nextInt();

        int temp = h1 > h2?(h1>h3?h1:h3):(h2>h3?h2:h3);
        System.out.println(temp);
    }
}
