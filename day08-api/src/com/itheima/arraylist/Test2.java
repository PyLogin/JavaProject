package com.itheima.arraylist;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        // 需求：存储自定义类型对象
        ArrayList<Movie> movies = new ArrayList<Movie>();
        movies.add(new Movie("长津湖", "吴京", 4.5));
        movies.add(new Movie("我和我的父辈", "吴京", 5.5));
        for (int i = 0; i < movies.size(); i++) {
            Movie m = movies.get(i);
            System.out.println("片名：" + m.getName());
            System.out.println("主演：" + m.getDirector());
            System.out.println("评分" + m.getScore());
            System.out.println("===========");

        }
    }
}
