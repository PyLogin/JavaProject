package com.itheima.string;

import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {
        // 需求：手机号码屏蔽功能
        Scanner sc = new Scanner(System.in);
        System.out.println("请您说如您的手机号码");
        String s = sc.next();
        //13833677261
        String prefix = s.substring(0, 3);
        String suffix = s.substring(7);
        System.out.println(prefix +"****"+ suffix);
    }
}
