package com.itheima.task;

public class ForTest8 {
    public static void main(String[] args) {
        //需求使用四行五列的长方形
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
