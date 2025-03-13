package com.itheima.operator;

public class Demo3 {
    public static void main(String[] args) {
        //目标：掌握自增自减运算符的使用
        // 自增 ++ 自减 --
        int count = 100;
        count++;
        ++count;
        System.out.println(count);

        int sum =10;
        sum--;
        --sum;
        System.out.println(sum);

        System.out.println("============");
        // ++ -- 如果不是单独使用，放在变量前后使用是有区别的
        int a = 10;
        int rs = ++a;
        System.out.println(a);
        System.out.println(rs);

        // ++ -- 放在变量后，是拿变量的值运算，再++ --
        int b = 10;
        int rs1 = b++;
        System.out.println(b); //11
        System.out.println(rs1); //10


    }
}
