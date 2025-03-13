package com.itheima.task;

public class Task2 {
    public static void main(String[] args) {
        //打印整数数组
        int[] arr = {100, 50, 90, 60, 80, 70};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
