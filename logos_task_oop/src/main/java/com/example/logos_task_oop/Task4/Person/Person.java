package com.example.logos_task_oop.Task4.Person;

import java.util.Random;

/*

Використовуючи клас Person
Створити наслідника - Student в якому
Оприділити поля: середній бал і група
В мейні потрібно створити масив Student довжиною 10 елементів.
Заповнити його студентами, в яких бал повинен рандомно
ініціалізуватись
Виведіть весь масив в форматі
Ім'я - середній_бал
і після цього виведіть середній бал по групі
 */
public class Person {

    public static void main(String[] args) {

        Student[] students = new Student[10];
        students[0] = new Student("java");
        students[2] = new Student("java");
        students[4] = new Student("PHP");
        students[5] = new Student("java");
        students[6] = new Student("PHP");
        students[7] = new Student("java");
        students[3] = new Student("PHP");
        students[1] = new Student("PHP");
        students[8] = new Student("HTML");
        students[9] = new Student("HTML");

        String first = "java";
        String second = "HTML";
        String thirst = "PHP";
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        double res=0;
        double res1 =0;
        double res2 =0;
        double a = 0;
        double b = 0;
        double c =0;
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        System.out.println();
        for (int i = 0; i <students.length ; i++) {
            if (students[i].getGroup().equals(second)) {
                count++;
            res=students[i].getAverage_rate()+students[i-1].getAverage_rate();
            a = res/count;
            }else if(students[i].getGroup().equals(thirst)){
                count2++;
                res2=students[i].getAverage_rate()+students[i-1].getAverage_rate();
                c = res2/count2;
            }else if(students[i].getGroup().equals(first)){
                count1++;
                res1=students[i].getAverage_rate()+students[i].getAverage_rate();
                b = res1/count1;
            }
        }
        System.out.println(count);
        System.out.println(res+ " = res ");
        System.out.println(a +" a ");

        System.out.println(count1);
        System.out.println(res1+ " = res1 ");
        System.out.println(b +" b ");

        System.out.println(count2);
        System.out.println(res2+ " = res2 ");
        System.out.println(c +" c ");
                /*
            } else if (students[i].getGroup().equals(second)) {
                count2++;

                    res1 = (students[i].getAverage_rate()+ students[i].getAverage_rate())/count;


            } else if (students[i].getGroup().equals(thirst)) {
                count3++;
                if(res2==0) {
                    res2 = (students[i].getAverage_rate() + students[i].getAverage_rate());
                }
            }
        }

        System.out.println("conutn = " + count);
        System.out.println("sum = " + res);
        System.out.println("conutn2 = " + count2);
        System.out.println("res1  = " + res1);

        System.out.println("conutn3 = " + count3);
        System.out.println("res2 = " + res2);
    */
            }
            }
