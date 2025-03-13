package com.itheima.branch;

public class IfDemo1 {
    public static void main(String[] args) {
        //目标：掌握if分支的三种写法
//        if (条件表达式){
//            语句体
//        }
        //场景：体温高出37.3就提示体温不正常
        double t = 37.5;
        if (t > 37.3) {
            System.out.println("体温过高");
        }
        //if(条件表达式){} else {}
        double money = 99;
        if (money > 520) {
            System.out.println("红包发送成功");
        }else{
            System.out.println("余额不足，别发了");
        }
    }
}
