package com.itheima.loop;

import java.util.Scanner;

public class PasspordTest11 {
    public static void main(String[] args) {
        //需求：系统密码为520，用户输入密码，验证不成功提示密码错误，验证成功提示欢迎进入程序
        int password = 520;
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("请输入密码");
            int extentPasspord = scanner.nextInt();
            if (password == extentPasspord) {
                System.out.println("密码正确，欢迎进入系统");
                break;
            } else {
                System.out.println("密码错误，重新输入");
            }
        }



    }
}
