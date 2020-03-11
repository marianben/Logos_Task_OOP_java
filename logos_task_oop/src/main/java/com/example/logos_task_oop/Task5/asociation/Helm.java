package com.example.logos_task_oop.Task5.asociation;

public class Helm {

    private boolean skin;

    public Helm(boolean spport) {
        this.skin = spport;
    }

    public boolean isSpport() {
        return skin;
    }

    public void setSpport(boolean spport) {
        this.skin = spport;
    }

    @Override
    public String toString() {
        return "Helm{" +
                "spport=" + skin +
                '}';
    }

    public void skin (){
        if (skin==true){
            System.out.println("It`s skin");
        }else{
            System.out.println("It1s not a skin");
        }
    }
}
