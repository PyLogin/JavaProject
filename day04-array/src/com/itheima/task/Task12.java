package com.itheima.task;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        //需求:在数组中插入一个整数，使数组按照大小排序
        int[] arr = {12,14,23,45,66,68,70,77,90,91};
        int[] brr = new int[11];
        int index = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= num) {
                brr[i] = arr[i];
                index = i + 1;
            } else {
                brr[i + 1] = arr[i];
            }
        }
        brr[index] = num;
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + " ");
        }

    }
}
