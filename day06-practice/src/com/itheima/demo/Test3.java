package com.itheima.demo;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        // 需求：生成验证码
        // 使用随机数Random生成
        System.out.println(creatCode(5));

    }
    public static String creatCode(int num){

        // 1、定义随机数对象
        Random r = new Random();
        // 2、生成0、1、2分别代表数字、大写字母、小写字母
         // 生成0、1、2
        String code = "";

        for (int i = 0; i < num; i++) {
            // 3、通过循环控制验证码位数
            // 4、通过Swich循环生成随机数字
            int type = r.nextInt(3);
            switch (type) {
                case 0:
                    // 代表大写字母
                  char ch1 = (char) (r.nextInt(26) + 65);
                  code += ch1;
                    break;
                case 1:
                    // 代表小写字母
                    char ch2 = (char) (r.nextInt(26) + 97);
                    code += ch2;
                    break;
                case 2:
                    // 代表数字
                    code += r.nextInt(10);
                    break;
            }
        }
        return code;
    }
}
