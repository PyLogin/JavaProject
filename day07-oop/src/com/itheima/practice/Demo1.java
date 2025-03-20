package com.itheima.practice;

public class Demo1 {
    public static void main(String[] args) {
        //目标：面向对象的案例
        Movie m1 = new Movie();
        m1.setActor("吴京");
        m1.setName("长津湖");
        m1.setScore(1.1);

        Movie m2 = new Movie();
        m2.setActor("王川");
        m2.setName("我和我的祖国");
        m2.setScore(2.1);

        Movie[] movies = new Movie[3];
        movies[0] = m1;
        movies[1] = m2;
        for (int i = 0; i < movies.length; i++) {
            System.out.println("主演" + movies[i].getActor());
            System.out.println("影评名" + movies[i].getName());
            System.out.println("评分：" + movies[i].getScore());
            System.out.println("=============================");
        }


    }
}
