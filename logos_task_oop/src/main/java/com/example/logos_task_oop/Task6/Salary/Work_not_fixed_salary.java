package com.example.logos_task_oop.Task6.Salary;

public class Work_not_fixed_salary implements Salary {

    private String name;
    private double salary;

    public Work_not_fixed_salary(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Work_not_fixed_salary{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public void salary() {
        double salary_by_hour = 164;
        System.out.println("My name is "+ name+" and my salary are "+(salary_by_hour*salary_by_hour)+ " $");
    }
}
