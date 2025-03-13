package com.itheima.task;

public class Task11 {
    public static void main(String[] args) {
        //需求：创建一个新数组，使奇数在左边，偶数在右边
        int[] arr = {12, 23, 34, 56, 78, 11, 22};
        int[] brr = new int[arr.length];
        int left = 0;
        int right = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                brr[left] = arr[i];
                left++;
            }else {
                brr[right] = arr[i];
                right--;
            }
        }
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i]+ "\t");
        }
    }
}
