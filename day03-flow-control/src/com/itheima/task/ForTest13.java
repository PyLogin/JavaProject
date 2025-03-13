package com.itheima.task;

public class ForTest13 {
    public static void main(String[] args) {
        //需求：计算水桶的灌水状态
        // 定义分钟数，初始为 0
        int minutes = 0;
        // 定义桶中现有的水量，初始为 0L
        double currentWater = 0;

        // 使用 while 循环，当桶中的水量小于 10L 时继续循环
        while (currentWater < 10) {
            // 分钟数加 1
            minutes++;
            // 计算当前这一分钟的灌水量
            double inflow = minutes;
            // 计算当前这一分钟的实际进水量（灌水量减去流水量）
            double netInflow = inflow - 3;

            // 计算当前桶中的水量
            currentWater = currentWater + netInflow;
            // 判断水量是否为负数，如果是则将其置为 0
            if (currentWater < 0) {
                currentWater = 0;
            }
        }

        // 循环结束后，打印所用的分钟数
        System.out.println("经过 " + minutes + " 分钟后，水桶能保持灌满水的状态。");
    }
}
