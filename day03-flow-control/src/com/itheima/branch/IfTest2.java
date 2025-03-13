package com.itheima.branch;

import java.util.Scanner;

public class IfTest2 {
    public static void main(String[] args) {
        //目标：通过scanner键盘录入功能，判断密码是否录入正确
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入6位密码：");
        int password = scanner.nextInt();
        if (password == 111111) {
            System.out.println("密码输入正确，欢迎进入系统");
        } else {
            System.out.println("密码输入错误，请重新输入");
        }

    }
}
