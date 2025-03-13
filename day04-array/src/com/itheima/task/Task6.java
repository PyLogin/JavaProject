package com.itheima.task;

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        //需求：创建一个长度为6 的整数数组，随机成0-100 之间的整数放到数组中，计算所有元素的和
        Random random = new Random();
        int[] arr = new int[6];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);

    }
}
