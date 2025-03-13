package com.itheima.task;

public class Task8 {
    public static void main(String[] args) {
        //需求：求平局值
        int[] arr = {72, 89, 65, 87, 91, 82, 71, 93, 76, 68};
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = sum / arr.length;
        System.out.println(avg);

    }
}
