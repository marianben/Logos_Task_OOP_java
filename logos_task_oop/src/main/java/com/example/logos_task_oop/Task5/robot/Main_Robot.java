package com.example.logos_task_oop.Task5.robot;

public class Main_Robot  {

    public static void main(String[] args) {

        CoffeRobot coffeRobot = new CoffeRobot();
        coffeRobot.work();

        Robot robot= new Robot();
        robot.work();

        RobotCoocker robotCoocker = new RobotCoocker();
        robotCoocker.work();

        RobotDancer robotDancer= new RobotDancer();
        robotDancer.work();
    }
}
