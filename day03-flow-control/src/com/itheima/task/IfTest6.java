package com.itheima.task;

import java.util.Scanner;

public class IfTest6 {
    public static void main(String[] args) {
        //需求：个税计算程序
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入税前工资:");
        int salary = scanner.nextInt();
        double insurance = salary * 0.1;
        double taxAmount = salary - insurance - 5000;
        double tax = 0;
        if (taxAmount <= 3000) {
            tax = taxAmount * 0.03;
        } else if (taxAmount <= 12000) {
            tax = 3000 * 0.03 + (taxAmount - 3000) * 0.1;
        } else if (taxAmount <= 25000) {
            tax = 3000 * 0.03 + 9000 * 0.1 + (taxAmount - 12000) * 0.2;
        }else if (taxAmount <= 35000) {
            tax = 3000 * 0.03 + 9000 * 0.1 + 10000 * 0.2 + (taxAmount - 25000) * 0.25;
        }else if (taxAmount <= 55000) {
            tax = 3000 * 0.03 + 9000 * 0.1 + 13000 * 0.2 + 10000 * 0.25 + (taxAmount - 35000) * 0.3;
        }else if (taxAmount <= 80000) {
            tax = 3000 * 0.03 + 9000 * 0.1 + 13000 * 0.2 + 10000 * 0.25 + 20000 * 0.3 +(taxAmount-55000) * 0.35;
        }else {
            tax = 3000 * 0.03 + 9000 * 0.1 + 13000 * 0.2 + 10000 * 0.25 + 20000 * 0.3 + 25000 * 0.35 + (taxAmount-800000) * 0.45;
        }
        double afterTaxSalary = salary - insurance - tax;

        // 输出结果
        System.out.printf("您的纳税数额为: %.2f 元\n", tax);
        System.out.printf("您的税后工资为: %.2f 元\n", afterTaxSalary);

        // 关闭 Scanner
        scanner.close();


    }
}
