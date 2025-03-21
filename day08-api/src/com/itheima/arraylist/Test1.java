package com.itheima.arraylist;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        // 需求：遍历删除元素值
        ArrayList<Integer> scores = new ArrayList<Integer>();
        scores.add(98);
        scores.add(77);
        scores.add(66);
        scores.add(79);
        scores.add(50);
        scores.add(90);
        System.out.print("删除前的数据" + scores);
        //完美方案一
        /*
        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i) <= 80) {
                scores.remove(i);
                i--;
            }
        }
        System.out.println();
        System.out.print("删除后的数据：" + scores);
        */
        //完美方案二
        for (int i = scores.size() - 1; i >= 0; i--) {
            if (scores.get(i) < 80) {
                scores.remove(i);
            }
        }
        System.out.println();
        System.out.print("删除后的数据：" + scores);
    }
}
