package com.itheima.demo;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //需求：买飞机票
        //旺季（5-10），头等舱9折，淡季（11-4）头等舱7折，经济舱6.5折
        Scanner sc = new Scanner(System.in);
        System.out.print("机票原价：");
        double pice = sc.nextDouble();
        System.out.println("请输入月份");
        int month = sc.nextInt();
        System.out.println("请您录入仓位类型(头等舱/经济舱)");
        String type = sc.next();
        double afterPice = calc(pice, month, type);
        System.out.println("机票原价为：" + pice);
        System.out.println("优惠后价格为：" + afterPice);

    }

    //定义方法计算机票价格
    public static double calc(double price, int month, String type) {
        //判断月份
        if (month >= 5 || month <= 10) {
            //旺季
            switch (type) {
                case "头等舱":
                    price *= 0.9;
                    break;
                case "经济舱":
                    price *= 0.85;
                    break;
                default:
                    price = -1;
                    System.out.println("舱位信息录入有误！");
            }
        } else if (month == 11 || month == 12 || month >= 1 && month <= 4) {
            //淡季
            switch (type) {
                case "头等舱":
                    price *= 0.7;
                    break;
                case "经济舱":
                    price *= 0.65;
                    break;
                default:
                    price = -1;
                    System.out.println("舱位信息录入有误！");
            }
        } else {
            price = -1;
            System.out.println("月份输入有误！");
        }
        return price;
    }
}
