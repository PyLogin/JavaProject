package com.itheima.branch;

public class IfTest1 {
    public static void main(String[] args) {
        //目标：通过if....else if ...实现奖励判断
        int score = 79;
        if (score >= 95 && score <= 100) {
            System.out.println("奖励一辆自行车");
        }else if (score >= 90 && score <= 94) {
            System.out.println("奖励一次游乐场");
        }else if (score >= 80 && score <= 89) {
            System.out.println("奖励一个大黄蜂");
        }else if (score >= 0 && score <= 79) {
            System.out.println("奖励一顿胖揍");
        }else{
            System.out.println("输入成绩有误，请重新输入");
        }
    }
}
