package com.itheima.demo;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        // 评委打分
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        int sum = 0;
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("请第" + (i + 1) + "位评委打分：");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            sum += arr[i];
        }

        double avg = (sum - max - min) / (arr.length - 2);
        System.out.println("去掉最高分：" + max);
        System.out.println("去掉最低分：" + min);
        System.out.println("最终得分：" + avg);


    }
}
