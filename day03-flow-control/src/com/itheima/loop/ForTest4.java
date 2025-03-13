package com.itheima.loop;

public class ForTest4 {
    public static void main(String[] args) {
        //需求：打印所有的“水仙花数”
        int count = 0;
        for (int i = 100; i < 999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            if ((ge * ge * ge + shi * shi * shi + bai * bai * bai) == i) {
                count++;
                System.out.println(i+"\t");
            }
        }
        System.out.println();
        System.out.println("水仙花数的个数是：" + count);
    }
}
