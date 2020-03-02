package com.example.logos_task_oop.Task3.Figure;

public class Priamokutnuck {

    private int weight;
    private int height;

    public Priamokutnuck(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Priamokutnuck{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void   permtr (){
        int permtr = (height+weight)*2;
         System.out.println(permtr);

    }

    public void   area (){
        int area = height*weight;
        System.out.println(area);
    }
}
