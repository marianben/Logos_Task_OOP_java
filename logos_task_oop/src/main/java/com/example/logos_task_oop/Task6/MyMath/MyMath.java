package com.example.logos_task_oop.Task6.MyMath;
/*
Створити клас MyMath.
В ньому створити 2-3 константи і 3-4 статичні методи.
Константи і методи повинні бути математичного характеру.
 */
public class MyMath {

        static final double COURSE_DOLAR = 24.98;
        static final double COURSE_EURO = 27.98;
        static final double COURSE_CRONE = 32.32;
        static final double COURSE_POUND = 35.43;
        public  int number;

    public MyMath(int number) {
        this.number = number;
    }

    public double getCOURSE_DOLAR() {
        return COURSE_DOLAR;
    }

    public double getCOURSE_EURO() {
        return COURSE_EURO;
    }

    public double getCOURSE_CRONE() {
        return COURSE_CRONE;
    }

    public double getCOURSE_POUND() {
        return COURSE_POUND;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    public static double course_dolar(int number){
        double course = number*COURSE_DOLAR;
        return course;
    }

    public static double course_euro(int number){
        double course = number*COURSE_EURO;
        return course;
    }

    public static double course_pound(int number){
        double course = number*COURSE_POUND;
        return course;
    }

    public static double course_crone(int number){
        double course = number*COURSE_CRONE;
        return course;
    }

    @Override
    public String toString() {
        return "MyMath{" +
                "number=" + number +
                '}';
    }
}

