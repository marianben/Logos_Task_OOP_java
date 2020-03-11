package com.example.logos_task_oop.Task5.asociation;
/*
Домашня робота:
Створити клас Кермо, Колесо, Кузов- описати дані
класи(гетери, сетери, туСтрінг). Всі
поля повинні бути приватними. Додати методи які б
виконували певні функції з полями.
Створити клас Машина, який матиме деякі свої поля та
обєкти класу Кермо, Кузов,Колесо-
як поля класу. Додати методи для виконання певних функцій.
Всі поля повинні бути
параметрами в конструкторі. В мейн методі , створии клас
Машина, запустити всі його
методи.
 */
public class Main {
    public static void main(String[] args) {

          //  Car car = new Car(1647,Body, Wheel, Helm true);
        Car car = new Car(6754,new Body("stall"),new Wheel(3),new Helm(true));
        System.out.println(car);
        car.price_by_UA();
        car.getBody().body_type(true);
        car.getWheel().size_wheel(4);
        car.getHelm().skin();

    }
}
