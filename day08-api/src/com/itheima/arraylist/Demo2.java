package com.itheima.arraylist;

import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {
        // 目标：掌握arraylist是泛型类书写格式和定义
        ArrayList<String> list = new ArrayList<>();
        list.add("韩红");
//        list.add(2);
//        list.add(3.14);
//        list.add(false);
//        list.add(' ');

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println(list1);

        ArrayList<Character> list2 = new ArrayList<>();
        list2.add('A');
        list2.add('B');



    }
}
