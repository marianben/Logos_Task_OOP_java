package com.example.logos_task_oop.Task5.asociation;

public class Body {

    private String type;

    public Body(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Body{" +
                "type='" + type + '\'' +
                '}';
    }

    public void body_type (boolean type){
        if(type==true) {
            System.out.println("Stall");
        }else{
            System.out.println("Plastik");
        }

    }
}
