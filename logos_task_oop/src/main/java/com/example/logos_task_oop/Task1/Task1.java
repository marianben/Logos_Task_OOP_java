package com.example.logos_task_oop.Task1;

import java.util.Scanner;

/*
Цикли
1. Створіть програму, що виводить на екран всі
чотиризначні числа послідовності 1000 1003 1006 1009 1012 1015.
2. Створіть програму, що виводить на екран перші
 55 елементів послідовності 1 3 5 7 9 11 13 15 17 ....
3. Створіть програму, що виводить на екран всі невід'ємні
елементи послідовності 90 85 80 75 70 65 60 ....
4. Створіть програму, що виводить на екран
перші 20 елементів послідовності 2 4 8 16 32 64 128 ....
5. Виведіть на екран всі члени
послідовності 2an-1-1, де a = 2, які менше 10000.
6. Виведіть на екран всі двозначні
члени послідовності 2an-1 + 200, де a = -166.
7. Створіть програму, яка обчислює факторіал
натурального числа n, яке користувач введе з клавіатури.
8. Виведіть на екран всі позитивні подільники
 натурального числа, введеного користувачем з клавіатури.
9. Перевірте, чи є введене користувачем з клавіатури
натуральне число - простим. Постарайтеся не виконувати зайвих дій
(наприклад, після того, як ви знайшли хоча б один нетривіальний дільник вже ясно,
 що число складене і перевірку продовжувати не потрібно).
 Також врахуйте, що найменший дільник натурального числа n, якщо він взагалі є,
  обов'язково розташовується в відрізку [2; √n].
10. Створіть програму, що виводить на екран 12 перших
елементів послідовності 2an-2-2, де a1 = 3 і a2 = 2.
11. Виведіть на екран перші 11 членів послідовності Фібоначчі.
Нагадуємо, що перший і другий члени послідовності рівні одиницям,
 а кожен наступний - сумою двох попередніх.
12. Для введеного користувачем з клавіатури натурального
числа порахуйте суму всіх його цифр (заздалегідь не відомо скільки цифр буде в числі).
 */
public class Task1 {

    public static void main(String[] args) {

        System.out.println("Input number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch (number) {
            case 1:
                System.out.println("You input =" + number);
                for (int i = 1000; i < 1018; i += 3) {
                    System.out.print(i + " ");
                }
                break;
            case 2:
                System.out.println("You input = " + number);
                int count = 0;
                for (int i = 1; i < 1000000; i += 2) {
                    count++;
                    if (count <= 55)
                        System.out.print(i + " ");
                }
                break;
            case 3:
                System.out.println("You input = " + number);
                for (int i = 90; i > 0; i-=5) {
                    System.out.print(i + " ");
                }
                break;
            case 4:
                System.out.println("You input = " + number);
                int count1 =0;
                for (int i = 2; i >0 ; i*=2) {
                    count1++;
                    if(count1 <=20){
                        System.out.print(i+ " ");
                    }
                }
                break;
            case 5:
                System.out.println("You input = " + number);
                int res=1;
                if (res<=10000){
                for (int n = 1; n < 1000; n++) {
                      int a =2;
                     res = 2*a*n-1;
                    System.out.print(res + " ");
                }}else {
                    System.out.println("Bad");
                }
                break;
            case 7:
                Scanner sc1 = new Scanner(System.in);
                System.out.println("Input number");
                int input_number = sc1.nextInt();
                long b =1;
                for (int factor = input_number; factor>0; factor--){
                    b =b*factor;

                }
                System.out.print(b);
                break;
            case 6:
                System.out.println("You input = " + number);
                for (int n = 1; n <5000000 ; n++) {
                    for (int a = -166; a < 100; a=2*a*n+200) {
                        if(a>-100&&(a>9||a<-9)){
                            System.out.print(a + " ");
                        }
                     }
                }
                break;
            case 8:
                System.out.println("input number");
                Scanner natural_number = new Scanner(System.in);
                int number3 = natural_number.nextInt();
                for (int i = number3; i >0 ; i--) {
                    int number_9 =number3%i;
                    if(number_9==0)
                        System.out.print(i+" ");
                }
                break;
            case 9:
                System.out.println("Input number");
                Scanner sc2 = new Scanner(System.in);
                if (sc2.hasNextInt()) {
                    int number_sc = sc2.nextInt();
                    int sqrt = (int) Math.sqrt(number_sc);
                    if (2 < number_sc && sqrt < number_sc) {
                        int count_one = 0;
                        for (int i = number_sc; i > 0; i--) {
                            System.out.println();
                            if (number_sc % i == 0) {
                                count_one++;
                                if (count_one >= 3) {
                                    System.out.println("No true");
                                } else {
                                    System.out.println("Is true");
                                }
                            }
                        }
                    } else {
                        System.out.println("It`s not a natural number");
                    }
                }
                break;
            case 10:
                int a1= 3;
                int a2 = 2;
               for(int i = 4; i<16; i++){
                    if(i%2==0){
                        int res_1 = 2*a2*i-2-2;
                        System.out.print(res_1 +" ");
                    }else {
                        int resultat = 2*a1*i-2-2;
                        System.out.print(resultat + " ");
                    }
                   }
                break;
            case 11:
                int fab_1 = 1;
                int fab_2 = 1;
                int fab =0;
                System.out.print(fab_1 + " " + fab_2 );
                      for (int i = 4; i <=12 ; i++) {
                   fab= fab_1+fab_2;
                          fab_1=fab_2;
                          fab_2=fab;
                    System.out.print(" " + fab +" ");
                }
            /*case 12:
              //  Для введеного користувачем з клавіатури натурального
               // числа порахуйте суму всіх його цифр (заздалегідь не відомо скільки цифр буде в числі).
                Scanner one_print = new Scanner(System.in);
                int one= one_print.nextInt();
                if (one==1){
                switch (one){
                    case 1:
                        for (int i = 0; i >0 ; i++) {
                            Scanner two_print = new Scanner(System.in);

                        }


                }
                for (int i = 0; i >0 ; i++) {

                }

              */
            default:
                System.out.println("Something wrong");
        }
    }
}



