package com.itheima.task;

public class IfTest2 {
    public static void main(String[] args) {
        //需求：李雷想买一个价值7988元的新手机，她的旧手机在二手市场能卖1500元，而手机专卖店推出以旧换新的优惠，把她的旧手机交给店家，新手机就能够打8折优惠。为了更省钱，李雷要不要以旧换新？请在控制台输出。
        int pice = 7988;
        int secodeHand = pice-1500;
        int discount =(int)(pice-(pice*0.8));
        if (secodeHand>discount){
            System.out.println("直接以旧换新");
        }else if (secodeHand<discount){
            System.out.println("卖给二手，再换新");
        }else{
            System.out.println("二手也行，换新也行");
        }
    }
}
