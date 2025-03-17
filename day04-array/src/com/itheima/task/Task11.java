package com.itheima.task;

public class Task11 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] brr = new int[arr.length];
        int left = 0;
        int right = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                brr[right] = arr[i];
                right--;
            } else {
                brr[left] = arr[i];
                left++;
            }
        }
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + " ");

        }
    }
}
