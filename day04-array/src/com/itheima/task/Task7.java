package com.itheima.task;

public class Task7 {
    public static void main(String[] args) {
        //需求：整形数组，0-9 之间的数组，组合一个整数
        int[] arr = {5, 6, 7, 8, 9};
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num = num * 10 + arr[i];
        }
        System.out.println(num);

    }
}
