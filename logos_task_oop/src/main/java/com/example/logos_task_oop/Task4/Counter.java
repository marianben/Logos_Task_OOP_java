package com.example.logos_task_oop.Task4;
/*
Завдання:
1. Створити клас лічильник(Counter)
стандартне значення лічильника - 0
має бути можливість збільшувати значення (на 1, не більше)
також читати теперішнє значення
 */
public class Counter {

    private int count =0;

    public Counter(int count) {
        this.count = count;
        count++;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "count=" + count +
                '}';
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
        count++;
    }
}
