package com.itheima.operator;

public class Test2 {
    public static void main(String[] args) {
        //目标：理解运算符的优先级
        // && 的优先级> ||
        System.out.println(10 > 3 || 10 > 3 && 10 < 3);
        System.out.println((10 > 3 || 10 > 3) && 10 < 3);
    }
}
