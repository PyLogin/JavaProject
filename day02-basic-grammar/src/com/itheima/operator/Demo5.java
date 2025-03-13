package com.itheima.operator;

public class Demo5 {
    public static void main(String[] args) {
        //目标：掌握赋值运算符
        //1.基本赋值运算符，一个=
        //2.扩展赋值运算符：+= -= *= /= %=
        int a = 10;
        a += 5;
        System.out.println(a);

        //3.扩展赋值运算符，隐藏了一个强类型转换
        byte b = 10;
        b += 5; // b = (byte)(b + c)
        System.out.println(b);
        System.out.println("=============");

        int x = 10;
        int y = 3;
//        System.out.println(x += y);
//        System.out.println(x -= y);
//        System.out.println(x *= y);
//        System.out.println(x /= y);
//        System.out.println(x %= y);
    }
}
