package com.itheima.operator;

//导包
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入您的年龄");
        int age = sc.nextInt();
        System.out.println("请输入您的姓名");
        String name = sc.next();

        System.out.println("您的姓名为：" + name);
        System.out.println("您的年龄为：" + age);
    }
}
