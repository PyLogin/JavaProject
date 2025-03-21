package com.itheima.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student(1, "叶孤城", 28, "护理一班"));
        students.add(new Student(2, "独孤雪", 33, "推拿一班"));

        System.out.println("学号\t姓名\t\t年龄\t班级");
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.println(student.getId() + "\t" + student.getName() + "\t" + student.getAge()+'\t'+student.getClas());
        }



        //查找学生
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入学生id");
            int id = sc.nextInt();
            Student student = getStudentById(students, id);
            if (student == null) {
                System.out.println("查无此人");
            }else {
                System.out.println("您要查找的学生信息");
                System.out.println(student.getId() + "\t" + student.getName() + "\t" + student.getAge()+'\t'+student.getClas());
                break;
            }
        }
    }




    public static Student getStudentById(ArrayList<Student> students, int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                //找到了
                return students.get(i);
            }
        }
        return null;
    }
}
