package com.itheima.dataconversion;

public class Demo2 {
    public static void main(String[] args) {
        //目标：掌握表达式中自动类型转换
        //表达式最终类型是由表达式中最高类型决定的
        //byte/short/char/是直接转换int类型参与计算的

        byte a = 10;
        short b = 20;
        char c = 'a';
        int d = 20;
        float f = 30;
        double g = 31.1;

        int rs1 = a + d;
        int rs2 = a + a;
        int rs3 = b + c;

        float rs4 = d + f;
        // 如果表达式中出现doouble类型，结果一定是double类型
        // 如果表达式中没有double类型，但是出现了float类型，结果一定是float
        // 如果表达式中没有double类型，也没有float类型，但有long类型，结果一定是long类型
        // 否则结果是int类型

    }
}
