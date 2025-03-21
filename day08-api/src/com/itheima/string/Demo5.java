package com.itheima.string;

import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        String sysName = "itheima";
        String sysPassword = "12345";
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < 3; i++) {
            System.out.print("请输入用户名");
            String userName = sc.next();
            System.out.println("请输入密码");
            String userPassword = sc.next();
            if (sysName.equals(userName) && sysPassword.equals(userPassword)) {
                System.out.println("登录成功，欢迎光临！");
                break;
            } else {
                System.out.println("账号和密码错误，还有" + (2 - i) + "次，请重新输入");
            }
        }
    }
}
