package com.itheima.task;

import java.util.Scanner;

public class SwichTest1 {
    public static void main(String[] args) {
        //目标：使用swich模拟计算器
        Scanner int1 = new Scanner(System.in);
        System.out.print("请输入第一个整数:");
        int num1 = int1.nextInt();
        Scanner int2 = new Scanner(System.in);
        System.out.print("请输入第二个整数:");
        int num2 = int2.nextInt();
        Scanner int3 = new Scanner(System.in);
        System.out.print("请输入计算方式:");
        int num3 = int3.nextInt();
        switch (num3){
            case 1:
                //加法
                System.out.println(num1+num2);
                break;
            case 2:
                //减法
                System.out.println(num1-num2);
                break;
            case 3:
                //乘法
                System.out.println(num1*num2);
                break;
            case 4:
                //除法
                System.out.println(num1/num2);
                break;
        }




    }
}
