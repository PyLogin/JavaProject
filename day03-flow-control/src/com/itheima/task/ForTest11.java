package com.itheima.task;

public class ForTest11 {
    public static void main(String[] args) {
        //需求:兑换钱币
        //将所有的钱币兑换成角
        int totalMoney = 10 * 10;
        int oneYuan = 10;
        int fiveYuan = 5;

        for (int i = 1; i <= 9; i++) {
            int leaveMoney = totalMoney - i * oneYuan;
            int leaveMoney1 = leaveMoney / fiveYuan;
            System.out.println("换1元纸币"+i+"张，"+"5角硬币"+leaveMoney1+"个");
        }



    }
}
