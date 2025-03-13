package com.itheima.loop;

public class WhileTest6 {
    public static void main(String[] args) {
        //需求：珠穆朗玛峰是8848860毫米，有一张足够大的纸
        int count = 0;
        double peakHeight = 8848860;
        double paperThickness = 0.1;
        while (paperThickness < peakHeight) {
            //折叠一次
            paperThickness = paperThickness * 2;
            //记录折叠次数
            count++;
        }
        System.out.println("一共折叠了：" + count + "次," + "纸张厚度为" + paperThickness);
    }
}
