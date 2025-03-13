package com.itheima.task;

public class Task3 {
    public static void main(String[] args) {
        //需求：打印输入中最小值
        int[] arr = {10, 50, 90, 60, 80, 70};
        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (temp > arr[i]) {
                temp = arr[i];
            }
        }
        System.out.println(temp);
    }
}
