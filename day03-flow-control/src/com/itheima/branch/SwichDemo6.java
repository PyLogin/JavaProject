package com.itheima.branch;

public class SwichDemo6 {
    public static void main(String[] args) {
        //目标：掌握swich穿透性的应用场景

        int month = 9;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(month+"月是31天");
                break;
            case 2:
                System.out.println(month+"月润年29天，非闰年28天");
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(month+"月是30天");
                break;
            default:
                System.out.println("输入的月份有误！");

        }
    }
}
