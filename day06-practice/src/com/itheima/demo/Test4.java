package com.itheima.demo;

import java.lang.reflect.Array;

public class Test4 {
    public static void main(String[] args) {
        // 需求：复制数组到一个新数组
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] brr = new int[arr.length];
        copyArray(arr, brr);

        System.out.println("原数组:");
        printArray(arr);
        System.out.println("新数组");
        printArray(brr);
    }

    //定义一个复制数组的方法
    public static void copyArray(int[] arr, int[] brr) {
        for (int i = 0; i < arr.length; i++) {
            brr[i] = arr[i];
        }
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ", ");
        }
        System.out.println("]");
    }
}
