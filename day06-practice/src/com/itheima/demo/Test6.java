package com.itheima.demo;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        // 需求：数字加密
        // 1、键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入要加密的数据长度");
        int index = sc.nextInt();
        // 2、 定义数组
        int[] arr = new int[index];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请您录入第" + (i + 1) + "位的数字");
            arr[i] = sc.nextInt();
        }

        //6、打印加密前的数据
        System.out.println("加密前的数据：");
        printArray(arr);


        //4、加密
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] + 5) % 10;
        }

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println("加密后的数据：");
        printArray(arr);


    }
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ", ");
        }
        System.out.println("]");
    }
}
