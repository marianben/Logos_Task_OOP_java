package com.example.logos_task_oop.Task5.asociation;

public class Car {

    private int price;
    private Body body;
    private Wheel wheel;
    private Helm helm;

    public Car(int price, Body body, Wheel wheel, Helm helm) {
        this.price = price;
        this.body = body;
        this.wheel = wheel;
        this.helm = helm;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Helm getHelm() {
        return helm;
    }

    public void setHelm(Helm helm) {
        this.helm = helm;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", body=" + body +
                ", wheel=" + wheel +
                ", helm=" + helm +
                '}';
    }

    public void  price_by_UA(){
        double UA = 24.6;
        System.out.println("Price by UA = "+ (UA*price));
    }
}
