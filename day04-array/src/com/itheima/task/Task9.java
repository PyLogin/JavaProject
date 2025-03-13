package com.itheima.task;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        //需求：手动输入一个整数，然后将整数放到数组中，重新排序
        int[] arr = {12, 14, 23, 45, 66, 68, 70, 77, 90, 91};
        int[] arr1 = new int[11];
        int index = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入1-100之间的数字");
        int num = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= num) {
                arr1[i] = arr[i];
                index = i + 1;
            } else {
                arr1[i + 1] = arr[i];
            }
        }
        arr1[index] = num;
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }


    }
}
