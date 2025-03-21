package com.itheima.arraylist;

import java.util.ArrayList;

public class Demo3 {
    public static void main(String[] args) {
        // 目标：掌握ArrayList常用API
        ArrayList<String> list = new ArrayList<>();
        list.add("郭德纲");
        list.add("Java");
        list.add("于谦");
        System.out.println(list.get(0)); //get 方法
        System.out.println(list.size()); //size方法

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        String remove = list.remove(0);
        System.out.println(remove);
    }
}
