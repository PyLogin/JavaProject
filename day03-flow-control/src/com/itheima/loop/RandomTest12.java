package com.itheima.loop;

import java.util.Random;

public class RandomTest12 {
    public static void main(String[] args) {
        //目标：掌握获取随机数的技术
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int number = random.nextInt(27) + 65;
            System.out.println("随机生成了：" + number);
        }
    }
}
