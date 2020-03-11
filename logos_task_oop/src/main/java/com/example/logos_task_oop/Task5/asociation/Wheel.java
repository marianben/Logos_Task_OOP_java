package com.example.logos_task_oop.Task5.asociation;

public class Wheel {

        private int size;

    public Wheel(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "size=" + size +
                '}';
    }

    public void size_wheel(int size){
        switch (size){
            case 1:
                System.out.println("R13");
            break;
            case 2:
                System.out.println("R14");
            break;
            case 3:
                System.out.println("R15");
            break;
            case 4:
                System.out.println("R16");
            break;
            default:
                System.out.println("something wrong");
        }
    }

}
