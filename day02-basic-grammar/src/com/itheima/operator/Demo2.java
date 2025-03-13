package com.itheima.operator;

public class Demo2 {
    public static void main(String[] args) {

        //目标：依次打印一个数的个位、十位、百位
        int a = 123;
        // 个位：
        int ge = 123 % 10;

        int shi = 123 / 10 % 10;

        int bai = 123 / 100;

        System.out.println(ge);
        System.out.println(shi);
        System.out.println(bai);

    }
}
