package com.itheima.param;

public class ParamTest1 {
    public static void main(String[] args) {
        //需求：打印数组内容
        //格式：[11, 22,33,44,55]
        int[] arr = new int[]{1,2,3,4,5};
        printArray(arr);


    }
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
//            if (i == arr.length - 1) {
//                System.out.print(arr[i]);
//            }else {
//                System.out.print(arr[i] + ", ");
//            }
            System.out.print(i == arr.length - 1?arr[i]:arr[i]+", ");
        }
        System.out.println("]");

    }
}
