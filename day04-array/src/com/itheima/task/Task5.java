package com.itheima.task;

public class Task5 {
    public static void main(String[] args) {
        //需求：去掉数组中的最小值和最大值，然后求平均值
        int[] arr = {100, 50, 90, 80, 70, 60};
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        avg = (sum - max - min) / (arr.length -2);

        System.out.println(avg);
    }
}
