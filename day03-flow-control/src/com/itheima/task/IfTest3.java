package com.itheima.task;

import java.util.Scanner;

public class IfTest3 {
    public static void main(String[] args) {
        //需求：让用户依次录入三个整数，求出三个数中的最小值，并打印到控制台。
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入三个整数:");
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();
        int min = 0;
        if (input1 <= input2) {
            min = input1;
        }else if (input2 <= input3) {
            min = input2;
        }else {
            min = input3;
        }
        System.out.println(min);


    }
}
