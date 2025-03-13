package com.itheima.traverse;

import java.util.Random;
import java.util.Scanner;

public class ArraryTest3 {
    public static void main(String[] args) {
        //需求：猜数字游戏
        int[] arr = new int[5];
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            arr[i] = random.nextInt(20) + 1;
        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]+"\t");
//        }
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入1-20之间的任意数字");
            int input = sc.nextInt();

            boolean flag = false;
            for (int i = 0; i < arr.length; i++) {
                if (input == arr[i]) {
                    System.out.println("猜中的索引位置是:" + i);
                    System.out.println("数组里面的所有元素：");
                    for (int i1 = 0; i1 < arr.length; i1++) {
                        System.out.print(arr[i1]+"\t");
                    }
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println("对不起，没有猜中，请重新输入");
            } else {
                //猜中了
                System.out.println("猜中了");
                break;
            }
        }


    }
}
