package com.itheima.create;

public class Demo5 {
    public static void main(String[] args) {
        //目标：数组求最值
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(max(arr));
    }
    public static int max(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
