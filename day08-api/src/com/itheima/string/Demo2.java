package com.itheima.string;

public class Demo2 {
    public static void main(String[] args) {
        // 目标：掌握String 类型的创建和比较
        String s1 = "abc";
        String s2 = "abc";
        if (s1.equals(s2)) {
            System.out.println("两个字符串相同");
        }else {
            System.out.println("两个字符串不同");
        }
    }
}
