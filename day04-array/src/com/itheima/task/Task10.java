package com.itheima.task;

public class Task10 {
    public static void main(String[] args) {
        double[] arr = {10.4, -3, -6.2, 1.2, -6.1, -1.9, -3.8, 0.9, -4.5, 5.5};
        int count = 0;
        int count1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                count++;
            } else {
                count1++;
            }
        }
        System.out.println("赔钱的股票有" + count + "支");
        System.out.println("挣钱的股票有" + count1 + "支");
    }
}
