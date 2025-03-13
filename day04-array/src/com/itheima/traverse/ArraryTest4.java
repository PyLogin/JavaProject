package com.itheima.traverse;

import java.util.Random;
import java.util.Scanner;

public class ArraryTest4 {
    public static void main(String[] args) {
        //需求：
        int[] employees = new int[5];
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < employees.length; i++) {
            System.out.println("请您录入第" + (i + 1) + "位员工工号：");
            int id = sc.nextInt();
            employees[i] = id;
        }
        //打印所有的数据
        for (int i = 0; i < employees.length; i++) {
            System.out.print(employees[i] + "\t");
        }
        System.out.println();
        //

        for (int i = 0; i < employees.length; i++) {
            int index = random.nextInt(employees.length);
            int temp = employees[i];
            employees[i] = employees[index];
            employees[index] = temp;

        }

        for (int i = 0; i < employees.length; i++) {
            System.out.print(employees[i] + "\t");
        }


    }
}
