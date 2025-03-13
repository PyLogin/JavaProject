package com.itheima.operator;

public class Demo8 {
    public static void main(String[] args) {
        //目标：三元运算符
        //条件表达式 ？ 值1:值2
//        int score = 60;
//        System.out.println(score >= 60 ? "考试通过" : "考试不及格");

        int a = 10;
        int b = 20;
        int c = 30;
        int bigger = a > b ? a : b;
        int max = bigger > c ? bigger : c;
        System.out.println("三个整数的最大值是：" + max);

       int max1 =  a > b ? a > c ?a :c : b > c ?b:c;
       System.out.println(max1);


    }
}
