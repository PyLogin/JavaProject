package com.itheima.string;

public class Demo1 {
    public static void main(String[] args) {
        // 目标：理解string是不可变字符串对象的原因
        String name= "传智";
        name += "教育";
        name += "中心";
        System.out.println(name);
    }
}
