package com.itheima.loop;

public class DeadLoopDemo8 {
    public static void main(String[] args) {
        //目标：掌握死循环的基本写法
//        for (; ; ) {
//            System.out.println("Hello World");
//        }
        //死循环的经典写法
        while (true) {
            System.out.println("Hello World");
        }
//        int i = 0;
//        do {
//            System.out.println("Hello World");
//            i++;
//        }while (true);


    }
}
