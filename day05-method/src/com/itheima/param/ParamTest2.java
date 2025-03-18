package com.itheima.param;

public class ParamTest2 {
    public static void main(String[] args) {
        //目标：从数组中打印查找的元素并返回索引,如果有多个索引直接返回第一个，如果数组中不存在查找的值，返回-1

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(getIndex(arr, 55));
    }

    public static int getIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
