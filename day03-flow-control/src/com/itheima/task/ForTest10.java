package com.itheima.task;

public class ForTest10 {
    public static void main(String[] args) {
        //需求:打印九九乘法表
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+"*"+j+"="+(i*j)+"\t");
            }
            System.out.println();
        }

    }
}
