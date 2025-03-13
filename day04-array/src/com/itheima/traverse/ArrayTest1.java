package com.itheima.traverse;

public class ArrayTest1 {
    public static void main(String[] args) {
        //目标：重点掌握数组遍历数据
        String[] names = new String[]{"你好", "你好1"};
        int[] name1 = {18, 20, 30};
        int sum = 0;
        for (int i = 0; i < name1.length; i++) {
            //每遍历到一个索引，就取出索引位置的元素
            sum += name1[i];
        }
        System.out.println(sum);
    }
}
