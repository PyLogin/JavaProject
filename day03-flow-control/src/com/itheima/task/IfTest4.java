package com.itheima.task;

import java.util.Scanner;

public class IfTest4 {
    public static void main(String[] args) {
        //需求：计算本息金额
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入存入金额:");
        int money = scanner.nextInt();
        System.out.print("请输入存入年限:");
        int year = scanner.nextInt();
        double moneySum = 0.0;
        if (year==1) {
            moneySum = money*2*2.25*year;
        }else if(year==2) {
            moneySum = money*2*2.7*year;
        }else if(year==3) {
            moneySum = money*2*3.25*year;
        }else if(year==5) {
            moneySum = money*2*3.6*year;
        }else{
            System.out.println("内容输入有误");
        }
        System.out.println(moneySum);

    }
}
