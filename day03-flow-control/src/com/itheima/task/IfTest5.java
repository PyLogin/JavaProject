package com.itheima.task;

import java.util.Scanner;

public class IfTest5 {
    public static void main(String[] args) {
        //需求：计算商场打折后的价格
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入用户类型:");
        double customerCate = scanner.nextInt();
        System.out.print("请输入购物的折前金额:");
        double afterPice = scanner.nextInt();

        if (customerCate == 0){
            //普通用户折扣
            if (afterPice >= 100){
                double Beforepice = afterPice *0.9;
                System.out.println(Beforepice);
            }else {
                System.out.println(afterPice);
            }
        }else if (customerCate == 1){
            //会员用户折扣
            if(afterPice >= 200){
                double beforPpice = afterPice *0.75;
                System.out.println(beforPpice);
            }else if(afterPice < 200){
                double beforePice = afterPice *0.8;
                System.out.println(beforePice);
            }
        }
    }
}
