package com.itheima.methodtask;

import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        int[] arr = {2588, 888, 1000, 10000};
        int[] brr = new int[5];
        int index = 0;
        Random random = new Random();
        while (index < arr.length) {
            int i = random.nextInt(arr.length);
            boolean b = exist(brr, arr[i]);
            if (!b) {
                brr[index] = arr[i];
                index++;
                System.out.println(arr[i] + "元的奖金被抽出");
            }
        }


    }

    public static boolean exist(int[] brr, int target) {
        for (int i = 0; i < brr.length; i++) {
            if (brr[i] == target) {
                return true;
            }
        }
        return false;
    }
}
