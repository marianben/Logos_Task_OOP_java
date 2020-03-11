package com.example.logos_task_oop.Task6.Salary;

public class main_salary {

    public static void main(String[] args) {

        Work_not_fixed_salary work_not_fixed_salary = new Work_not_fixed_salary("Ivan", 7);
        work_not_fixed_salary.salary();

        Worker_fixed_salary worker_fixed_salary = new Worker_fixed_salary("Tolik", 2345);
        worker_fixed_salary.salary();

    }

}
