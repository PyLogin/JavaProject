package com.itheima.arraylist;

public class Movie {
    private String name;
    private String director;
    private double score;

    public Movie(){

    }
    public Movie(String name, String director, double score) {
        this.name = name;
        this.director = director;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
