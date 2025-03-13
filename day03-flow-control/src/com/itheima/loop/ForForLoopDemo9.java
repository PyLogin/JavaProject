package com.itheima.loop;

public class ForForLoopDemo9 {
    public static void main(String[] args) {
        //目标：掌握循环嵌套的写法
        //需求：连续三天，每天都说5遍我爱你
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("我错了" + (i + 1));
            }
            System.out.println("===========");
        }
    }
}
