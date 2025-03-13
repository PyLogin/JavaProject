package com.itheima.traverse;

import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        System.out.println("请输入三个数据");
        int maxIndex = arr[0];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > maxIndex) {
                maxIndex = arr[i];
            }
        }
        System.out.println(maxIndex);
    }
}
