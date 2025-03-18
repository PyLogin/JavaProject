package com.itheima.param;

public class ParaTest3 {
    public static void main(String[] args) {
        //目标：判断两个任意整形数组是否一样
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(equals(arr, arr1));
    }
    public static Boolean equals(int[] arr, int[] arr2) {
        if (arr == null || arr2 == null) {
            return false;
        } else if (arr.length != arr2.length) {
            return false;
        }else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != arr2[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
