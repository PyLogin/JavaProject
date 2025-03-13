package com.itheima.task;

public class ForTest12 {
    public static void main(String[] args) {
        //需求：计算闰年
        int year = 1988;
        int newYear = 2019;
        for (int i = year; i <= newYear; i++) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }
    }
}
