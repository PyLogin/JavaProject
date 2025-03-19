package com.itheima.demo;

public class Demo5 {
    public static void main(String[] args) {
        //目标：掌握动态初始化数组的默认值规则
        byte[] byt1 = new byte[3];
        System.out.println(byt1[0]);
        System.out.println(byt1[1]);
        System.out.println(byt1[2]);
        System.out.println("=============");

        long[] longs = new long[3];
        System.out.println(longs[0]);
        System.out.println(longs[1]);
        System.out.println(longs[2]);
        System.out.println("=============");

        //布尔类型
        boolean[] bools = new boolean[3];
        System.out.println(bools[0]);
        System.out.println(bools[1]);
        System.out.println(bools[2]);
        System.out.println("=============");

        char[] chars = new char[3];
        System.out.println( chars[0]);
        System.out.println(chars[1]);
        System.out.println(chars[2]);

        System.out.println("=============");

        double[] doubles = new double[3];
        System.out.println( doubles[0]);
        System.out.println( doubles[1]);
        System.out.println( doubles[2]);
        System.out.println("=============");

        String[] strings = new String[3];
        System.out.println( strings[0]);
        System.out.println( strings[1]);
    }
}
