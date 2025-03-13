package com.itheima.task;

public class ForTest7 {
    public static void main(String[] args) {
        for (int i = 1949; i <= 2019; i++) {
            if ((i - 2019) % 12 == 0) {
                System.out.println(i);
            }
        }
    }
}
