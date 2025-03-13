package com.itheima.loop;

import java.util.Random;
import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args) {
        //需求：猜数字游戏
        Random random = new Random();
        int randomNum = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个1-100之间的数字");
            int inputNum = scanner.nextInt();
            if (inputNum > randomNum) {
                System.out.println("猜大了");
            }else if (inputNum < randomNum) {
                System.out.println("猜小了");
            }else {
                System.out.println("恭喜你才对了");
                break;
            }
        }


    }
}
