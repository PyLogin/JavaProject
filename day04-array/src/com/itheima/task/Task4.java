package com.itheima.task;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = {100, 50, 90, 60,80,70};
        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > temp) {
                temp = arr[i];
            }
        }
        System.out.println(temp);
    }
}
