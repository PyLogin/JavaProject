package com.itheima.branch;

public class SwichDemo4 {
    public static void main(String[] args) {
        //目标：掌握Swich分支的使用，并理解其执行流程

        String weekday = "周二";

        switch (weekday) {
            case "周一":
                System.out.println("周一埋头苦干");
            case "周二":
                System.out.println("周二请大牛帮忙");
                break;
            case "周三":
                System.out.println("周三请大牛喝酒");
                break;
            case "周四":
                System.out.println("主动帮助女生解决问题");
                break;
            case "周五":
                System.out.println("吃鸡");
                break;
            case "周六":
                System.out.println("相亲");
                break;
            case "周日":
                System.out.println("抑郁呱皇");
                break;
            default:
                System.out.println("您输入内容有问题");

        }
    }
}
