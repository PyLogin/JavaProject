package com.itheima.loop;

public class ForTest3 {
    public static void main(String[] args) {
        //需求：1-10之间所有奇数和
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        System.out.println("1-10之间的奇数和是：" + sum);


        //方式二
        int sum1 = 0;
        for (int i = 1; i <= 10; i+=2) {
            if (i % 2 == 1) {
                sum1 += i;
            }
        }
        System.out.println("1-10之间的奇数和是：" + sum1);
    }
}
