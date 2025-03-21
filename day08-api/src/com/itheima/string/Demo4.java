package com.itheima.string;

import java.util.Random;

public class Demo4 {
    public static void main(String[] args) {
        String s1 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random rd = new Random();
        String code = "";
        for (int i = 0; i < 5; i++) {
            int index = rd.nextInt(s1.length());
            code += s1.charAt(index);
        }
        System.out.println(code);
    }
}
