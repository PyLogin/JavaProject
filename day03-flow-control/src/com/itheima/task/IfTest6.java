package com.itheima.task;

import java.util.Scanner;

public class IfTest6 {
    public static void main(String[] args) {
        //需求：个税计算程序
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入税前工资:");
        int salary = scanner.nextInt();
        double taxAmount = salary - (salary * 0.1) - 5000;
        System.out.println("去掉三险一金：" + taxAmount);

        if (taxAmount >= 0 && taxAmount <= 3000) {
            taxAmount = taxAmount * 0.03;
            System.out.println(salary - taxAmount);
        } else if (taxAmount >= 3000 && taxAmount <= 12000) {
            taxAmount = taxAmount * 0.1;
            System.out.println(salary - taxAmount);
        }  else if (taxAmount >= 12000 && taxAmount <= 25000) {
            taxAmount = taxAmount * 0.2;
            System.out.println(salary - taxAmount);
        } else if (taxAmount >= 25000 && taxAmount <= 35000) {
            taxAmount = taxAmount * 0.25;
            System.out.println(salary - taxAmount);
        } else if (taxAmount >= 35000 && taxAmount <= 55000) {
            taxAmount = taxAmount * 0.3;
            System.out.println(salary - taxAmount);
        } else if (taxAmount >= 55000 && taxAmount <= 80000) {
            taxAmount = taxAmount * 0.35;
            System.out.println(salary - taxAmount);
        } else if (taxAmount > 800000) {
            taxAmount = taxAmount * 0.45;
            System.out.println(salary - taxAmount);
        } else {
            System.out.println("输入有误");
        }
    }
}
