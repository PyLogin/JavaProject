package com.itheima.test;

public class Demo5 {
    public static void main(String[] args) {
        //1.定义三个int变量yxrs,yzhsm,mf,代表三个菜品的价格,并初始化
        int yxrs = 24, yzhsm = 8, mf = 3;
        //2.根据小明的购买信息,计算优惠前的总价格,保存int变量price
        int price = yxrs * 3 + yzhsm * 3 + mf * 5;
        //3.根据优惠方式计算小明购买菜品优惠后的价格,保存int变量afterPrice中
        int afterPrice = (price > 100) ? (int) (price * 0.9) : price;
        //4.打印输出结果数据
        System.out.println("优惠前: " + price + "元, 优惠后: " + afterPrice + "元");
    }
}
