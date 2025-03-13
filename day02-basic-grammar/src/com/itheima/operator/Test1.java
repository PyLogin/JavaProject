package com.itheima.operator;

public class Test1 {
    public static void main(String[] args) {

        int c = 10;
        int d = 5;

        int rs = c++ + ++c - --d - ++d + 1 + c--;
        //22
        //
        System.out.println(rs);
        System.out.println(c);
        System.out.println(d);
    }
}
