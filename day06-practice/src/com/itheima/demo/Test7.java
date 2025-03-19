package com.itheima.demo;

import java.util.Random;
import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        // 需求：模拟双色球
        int[] luckyNumber = createLuckyNumber();
        printArray(luckyNumber);
        int[] userInputNumber = userInputNumber();
        judge(luckyNumber,userInputNumber);


    }

    public static int[] createLuckyNumber() {
        int[] arr = new int[7];
        boolean flag = true;

        // 2、生成6个红球
        Random random = new Random();
        for (int i = 0; i < arr.length - 1; i++) {
            while (true) {
                int num = random.nextInt(33) + 1;
                for (int j = 0; j < i; j++) {
                    if (num == arr[j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    arr[i] = num;
                    break;
                }
            }
        }
        arr[arr.length - 1] = random.nextInt(16) + 1;
        return arr;
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ", ");
        }
        System.out.println("]");
    }

    public static int[] userInputNumber() {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[7];

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print("请输入第" + (i + 1) + "红球号码(1-33)");
            int num = scanner.nextInt();
            arr[i] = num;
        }

        System.out.println("请输入1个蓝球");
        arr[arr.length - 1] = scanner.nextInt();
        return arr;
    }

    /**
     * 判断用户中奖情况
     *
     * @param luckyNumber     中奖号码
     * @param userInputNumber 用户号码
     */
    public static void judge(int[] luckyNumber, int[] userInputNumber) {

        int red = 0;
        int blue = 0;
        for (int i = 0; i < userInputNumber.length - 1; i++) {
            for (int j = 0; j < luckyNumber.length - 1; j++) {
                if (userInputNumber[i] == luckyNumber[j]) {
                    red++;
                    break;
                }
            }
        }
        blue = userInputNumber[userInputNumber.length - 1] == luckyNumber[luckyNumber.length - 1] ? ++blue : blue;
        if (blue == 1 && red <= 2) {
            System.out.println("中了5块钱");
        } else if (red == 4 && blue == 0 || red == 3 && blue == 1) {
            System.out.println("中了10块钱");
        }else if (red == 5 && blue == 0 || red == 4 && blue == 1) {
            System.out.println("中了200块钱");
        } else if (red == 5 && blue == 1 ) {
            System.out.println("中3000块钱");
        }else if (red == 6 && blue == 0 ) {
            System.out.println("中500万块钱");
        }else if (red == 6 && blue == 1 ) {
            System.out.println("中1000万块钱");
        }else {
            System.out.println("分b没中");
        }
    }
}
