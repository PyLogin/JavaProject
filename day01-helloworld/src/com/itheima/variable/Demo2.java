package com.itheima.variable;


public class Demo2 {
    public static void main(String[] args) {
        /*
         * 掌握变量的注意事项
         */
        //变量必须先声明，再使用
        int age = 21;
        System.out.println(age);

        //变量声明后，无法存储其他类型数据
//        int age1 = 1.1;
//        double score = 100;
        //变量定义的有效范围为离变量最近的{}截止，且在同一个范围内不能定义2个同名变量
        //定义的时候可以没有初始值，但是使用的时候需要有初始值

        /*int 中国 = 30;
        System.out.println(中国);*/
    }
}
