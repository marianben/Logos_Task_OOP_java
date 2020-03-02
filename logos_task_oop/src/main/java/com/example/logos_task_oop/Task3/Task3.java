package com.example.logos_task_oop.Task3;

import java.util.Scanner;

/*
На практичне завдання у вас є близько тижня, точно скажу коли потрібно принести
Для тих хто не був: потрібно зробити гру хрестики-нулики або морський бій.
Це завдання охоплює всі основи і виступає в ролі закріплення тем.
 */
public class Task3 {

    public static void main(String[] args) {

        System.out.println("Choose what do you want ");
        System.out.println("Menu: " + "\n"+
                "1 - are number even " +"\n"+
                "2 - sum two number " +"\n"+
                "3 - what number are biggest with tree number by module" +"\n"+
                "4 - choose what is world polinom" +"\n"+
                "5 - word to lower case " + "\n" +
                "6 - Trim string");
        Scanner sc_main = new Scanner(System.in);
        int number_main = sc_main.nextInt();
        switch (number_main){
            case 1:
                Input();
                break;
            case 2:
                Calc();
                break;
            case 3:
                Number_by_module();
                break;
            case 4:
                Same_name();
                break;
            case 5:
                ToLowerCase();
                break;
            case 6:
                Trim_string();
                break;
            default:
                System.out.println("Bad number");
        }


    }
    public static void Input(){
        /*
        1. повідомляти, чи є ціле число, введене користувачем,парним або непарним.
        Якщо користувач введе не ціла число, то повідомляти йому про помилку.
         */
        System.out.println("Input integer number");
        Scanner sc =new Scanner(System.in);
            if(sc.hasNextInt()) {
                int input = sc.nextInt();
                if(input%2==0){
                    System.out.println("Number is even");
                }else {
                    System.out.println("Number is not even");
                }
            }else {
                System.out.println("It`s not a number! Please ");
            }

    }

    public static void Calc(){
        /*
        обчислювати і виводити на екран суму двох цілих
        чисел, введених користувачем. Якщо користувач некоректно введе хоча б одне з
        чисел, то повідомляти про помилку.
         */
        System.out.println("Input first number");
        Scanner sc1 = new Scanner(System.in);
        if(sc1.hasNextInt()){
            int a = sc1.nextInt();
            System.out.println("Input second number");
            if(sc1.hasNextInt()){
                int b = sc1.nextInt();
                int res =a+b;
                System.out.println("res = "+res);
            }else {
                System.out.println("Not correct second number");
            }
        }else{
            System.out.println("Not correct number one!");
        }

    }

    public static void Number_by_module(){
        /*виводити на екран меншу за модулем з трьох
            введених користувачем дійсних чисел.*/
        System.out.println("Input first double number");
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextDouble()){
            double a = sc.nextDouble();
                double res_a = Math.abs(a);
                System.out.println("First number by module = "+ res_a);
            System.out.println();

            System.out.println("Input second double number ");
            if(sc.hasNextDouble()) {
                double b = sc.nextDouble();
                double res_b = Math.abs(b);
                System.out.println("Second number by module = " + res_b);
                System.out.println();

                System.out.println("Input last double number");
                if(sc.hasNextDouble()){
                    double c =sc.nextDouble();
                    double res_c = Math.abs(c);
                    System.out.println("Last number by module = "+ res_c );
                    System.out.println();
                    //The biggest number
                if(res_a>res_b&&res_a>res_c){
                     System.out.println("The bigger number by module are first number = "+res_a);
                     }
                if(res_b>res_a&&res_b>res_c){
                        System.out.println("The bigger number by module are two number = "+res_b);
                    }
                if(res_c>res_b&&res_c>res_a){
                        System.out.println("The bigger number by module are three number = "+res_c);
                    }

                }else {
                    System.out.println("Last  number bad");
                }
            }else {
                System.out.println("Bad number two");
            }
        }else {
            System.out.println("It`s not a double");
        }
    }

    public static void Same_name(){
        /*
        4. провіряти чи вхідна стрічка є паліндромом,
        тобто яка читається з обох сторін однаково (анна, око)
         */
        System.out.println("Input count of letter");
        Scanner sc3 = new Scanner(System.in);
        if(sc3!=null){
            int number  = sc3.nextInt();
            System.out.println("Input a world");
            String str = sc3.next();
        switch (number){
            case 2:
                if(str.charAt(0)==str.charAt(1)){
                    System.out.println("The world are polinom");
                }else {
                    System.out.println("not a polinom");
                }
                break;
            case 3:
                if(str.charAt(0)==str.charAt(2)){
                    System.out.println("The strinf are polinom");
                }else {
                    System.out.println("not a polinom");
                }
                break;
            case 4:
                if(str.charAt(0)==str.charAt(3)){
                    if(str.charAt(1)==str.charAt(2)){
                        System.out.println("The strinf are polinom");
                    }else {
                        System.out.println(" no polinom");
                    }
                }else {
                    System.out.println("not a polinom");
                }
                break;
            default:
            {
                System.out.println("Something wrong");
            }
        }
        }



    }

    public static void ToLowerCase(){
        /*
        приводити перший символ стрічки до верхнього регістру
        іван -> Іван
         */
        System.out.println("Input word");
        Scanner sc4 = new Scanner(System.in);
        String string  = sc4.next();
        if(string!=null){
            System.out.println(string.substring(0,1).toUpperCase()+string.substring(1));
        }else {
            System.out.println("There are some problem");
        }
    }

    public static void Trim_string() {
    /*
    програму яка буде обрізати стрічку, якщо вона довша 20 символів і вкінці добавляти "..."
     */
        Scanner sc5 = new Scanner(System.in);
        String string  = "asdec jnbjr.dfvmao'okmf.dkvmgfmb s,mbnimbskg";
        String change_string = string.substring(0,25)+ "....";
        System.out.println(change_string);


    }
}
