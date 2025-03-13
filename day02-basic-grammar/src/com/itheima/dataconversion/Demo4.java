package com.itheima.dataconversion;

public class Demo4 {
    public static void main(String[] args) {
        int fathor = 180;
        int mother = 164;

        int sun = (int) ((fathor + mother) * 1.08 / 2);
        int douther = (int) ((fathor * 0.93 + mother) / 2);
        System.out.println(sun);
        System.out.println(douther);

    }
}
