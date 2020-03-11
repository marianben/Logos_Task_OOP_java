package com.example.logos_task_oop.Task4.Person;

import java.util.Random;

public class Student {

    private String group;
    public double average_rate =1+ Math.random()*12;




    public Student(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "average_rate=" + average_rate +
                ", group='" + group + '\'' +
                '}';
    }

    public double getAverage_rate() {
        return average_rate;
    }


    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }


    }

