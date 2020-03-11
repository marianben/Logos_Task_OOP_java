package com.example.logos_task_oop.Task6.Salary;

public class Worker_fixed_salary implements Salary{

    private String name;
    private int pay_for_work;

    public Worker_fixed_salary(String name, int pay_for_work) {
        this.name = name;
        this.pay_for_work = pay_for_work;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPay_for_work() {
        return pay_for_work;
    }

    public void setPay_for_work(int pay_for_work) {
        this.pay_for_work = pay_for_work;
    }

    @Override
    public String toString() {
        return "Worker_fixed_salary{" +
                "name='" + name + '\'' +
                ", pay_for_work=" + pay_for_work +
                '}';
    }

    @Override
    public void salary() {
        System.out.println("My name is "+name+" and my salary are "+pay_for_work+" $");
    }
}
