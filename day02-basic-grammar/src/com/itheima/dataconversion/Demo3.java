package com.itheima.dataconversion;

public class Demo3 {
    public static void main(String[] args){
        //目标：学习强制类型转换
        //强制类型转换的语法；数据类型（变量2）= （数据类型）变量1
        int a = 20;
//        byte b = a; //报错：类型范围大的数据或者变量，不能直接赋值给类型范围小的变量，会报错
        byte b = (byte)a;
        System.out.println(b);

        /*
        1、强制类型转换可能造成数据（丢失）溢出
        2、浮点型转换int类型时，直接舍掉小数点后面的
         */
        int i = 1500;
        byte c = (byte)i;
        System.out.println(c);


        double d = 3.14;
        int b1 = (int)d;
        System.out.println(b1);
    }
}
