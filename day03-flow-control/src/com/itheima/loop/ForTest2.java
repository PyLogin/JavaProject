package com.itheima.loop;

public class ForTest2 {
    public static void main(String[] args) {
        //目标:掌握For循环案例
        //定义一个for循环，产生一个1-5的所有数字和
        //1.定义一个sum临时累加变量，用来记录最终的结果

        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            //2.每拿到一个数字就加到sum中
            sum += i;
            System.out.println(i);

        }
        //3.在for循环外打印最后的结果
        System.out.println("1-5之间的所有数据和：" + sum);

    }
}
