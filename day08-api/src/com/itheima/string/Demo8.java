package com.itheima.string;

public class Demo8 {
    public static void main(String[] args) {
        //目标：比较下面的输出结果是多少
        String s1 = new String("abc");
        String s2 = "abc";
        System.out.println(s1 == s2);


        String s3 = "abc";
        String s4 = "ab";
        String s5 = s3 + "c";
        System.out.println(s3 == s5);

        String s6 = "abc";
        String s7 = "a" + "b" + "c";
        System.out.println(s6 == s7); //false?

    }
}
