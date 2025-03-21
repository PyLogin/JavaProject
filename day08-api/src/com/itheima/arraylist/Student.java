package com.itheima.arraylist;

import java.util.ArrayList;

public class Student {
    private int id;
    private String name;
    private int age;
    private String clas;

    public Student() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student(int id, String name, int age, String clas) {
        this.name = name;
        this.age = age;
        this.clas = clas;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

}
