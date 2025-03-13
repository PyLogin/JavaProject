package com.itheima.traverse;

public class ArraryTest2 {
    public static void main(String[] args) {
        //需求：求数组最值
        //1.静态初始化数据，存储颜值数据
        int[] arr = {15, 9000, 10000, 20000, 9500, -5};

        //2.定义一个变量存储最大颜值
        int max = arr[0];

        //3.遍历取出最大颜值
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("最大数值：" + max);
    }
}
