package com.itheima.loop;

public class WhileDemo5 {
    public static void main(String[] args) {
        //目标：掌握while的写法和执行流程
        int i= 0; // 初始化语句
        while (i < 3) { //循环语句
            System.out.println("HelloWorld!");//循环体语句
            i++;//迭代语句
        }
        System.out.println(i);

        // 什么时候用for循环，什么时候用while循环
        // 知道循环次数用for，不知道循环次数用while
    }
}
