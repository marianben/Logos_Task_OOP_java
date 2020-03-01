package com.example.logos_task_oop.Task2;

import java.util.Random;
import java.util.Scanner;

/*
 Random random = new Random();
int a = random.nextInt(20); //[0; 20)
int a1 = 20 + random.nextInt(10); // [20; 30)
int a2 = random.nextInt() % 700; //(-699; 699)
 */
public class Task2 {

    public static void main(String[] args) {

        System.out.println("Input number");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            switch (number) {
                case 1:
                     /*1. Створіть масив з усіх парних чисел від 2 до 20 і виведіть
                     елементи масиву на екран спочатку в рядок, відокремлюючи один елемент
                     від іншого прогалиною, а потім в стовпчик (відокремлюючи один елемент
                         від іншого початком нового рядка). Перед створенням масиву подумайте,
                         якого він буде розміру.
                     2 4 6 … 18 20 */
                    int[] arr1 = new int[21];
                    for (int i = 1; i < 21; i++) {
                        arr1[i] = i;
                    }
                    for (int i = 2; i < 21; i += 2) {
                        System.out.print(arr1[i] + " ");
                    }
                    System.out.println();
                    for (int i = 2; i < 21; i += 2) {
                        System.out.println(arr1[i]);
                    }
                    break;
                case 2:
                    /* 2. Створіть масив з усіх непарних чисел від 1 до 99,
                         виведіть його на екран у рядок, а потім цей же масив виведіть
                     на екран теж в рядок, але в зворотному порядку (99 97 95 93 ... 7 5 3 1).*/
                    int mas[] = new int[101];
                    for (int i = 1; i < 100; i++) {
                        mas[i] = i;
                    }
                    for (int i = 1; i < 100; i += 2) {
                        System.out.print(mas[i] + " ");
                    }
                    System.out.println();
                    for (int i = 99; i > 0; i -= 2) {
                        System.out.print(mas[i] + " ");
                    }
                    break;
                case 3:
                    // Створіть масив з 15 випадкових цілих чисел з відрізка [0; 9].
                    // Виведіть масив на екран. Підрахуйте скільки в масиві парних
                    // елементів і виведете цю кількість на екран на окремому рядку.
                    int b = 0;
                    int[] Mas = new int[15];
                    for (int i = 0; i < Mas.length; i++) {
                        Random rnd = new Random();
                        int rd = rnd.nextInt(9);
                        Mas[i] = rd;

                    }
                    for (int i = 0; i < Mas.length; i++) {
                        System.out.print(Mas[i] + " ");
                        if (Mas[i] % 2 == 0) {
                            b++;

                        }
                    }
                    System.out.println("Count =" + b);
                    break;
                case 4:
                    /* 4. Створіть масив з 8 випадкових цілих чисел з відрізка [1; 10].
                     Виведіть масив на екран у рядок. Замініть кожен елемент з непарним індексом на нуль.
                     Знову виведете масив на екран на окремому рядку.*/

                    int[] ar = new int[15];
                    for (int i = 0; i < ar.length; i++) {
                        Random rnd = new Random();
                        int rd = 1 + rnd.nextInt(10);
                        ar[i] = rd;
                    }
                    for (int i = 0; i < ar.length; i++) {
                        System.out.print(ar[i] + " ");
                    }
                    System.out.println();
                    for (int i = 0; i < ar.length; i++) {
                        if (ar[i] % 2 == 1) {
                            ar[i] = 0;
                        }
                        System.out.print(ar[i] + " ");
                    }
                    break;
                case 5:
                    /* 5. Створіть 2 масиви з 5 випадкових цілих чисел з відрізка [0; 5]
                     кожен, виведіть масиви на екран у двох окремих рядках. Порахуйте
                     середнє арифметичне елементів кожного масиву і повідомте, для
                     якого з масивів це значення виявилося більше
                      (або повідомте, що їх середні арифметичні рівні).*/
                    int araay[] = new int[5];
                    int array1[] = new int[5];
                    int sum = 0;
                    int sum1 = 0;
                    double res = 0;
                    double res1 = 0;
                    for (int i = 0; i < araay.length; i++) {
                        Random rnd = new Random();
                        int rd = rnd.nextInt(5);
                        araay[i] = rd;

                        int rd2 = rnd.nextInt(5);
                        array1[i] = rd2;
                    }
                    for (int i = 0; i < araay.length; i++) {
                        sum += araay[i];
                        res = sum / araay.length;
                        System.out.print(araay[i] + " ");
                    }
                    System.out.println("res = " + res);
                    System.out.println("sum = " + sum);
                    System.out.println();
                    for (int i = 0; i < array1.length; i++) {
                        sum1 += array1[i];
                        res1 = sum1 / array1.length;
                        System.out.print(array1[i] + "--");
                    }
                    System.out.println("res1= " + res1);
                    System.out.println("sum = " + sum1);
                    if (res > res1) {
                        System.out.println("Array one");
                    } else if (res < res1) {
                        System.out.println("Array two");
                    } else {
                        System.out.println("Array one and two");
                    }
                    break;
                case 6:
                    /* 6. Створіть масив з 4 випадкових цілих чисел з відрізка [10; 99],
                     виведіть його на екран у рядок. Визначити і вивести на екран
                     повідомлення про те, чи є масив строго зростаючої послідовністю.  */
                    int[] arr = new int[4];
                    for (int i = 0; i < arr.length; i++) {
                        Random random = new Random();
                        int rand = 9 + random.nextInt(100);
                        arr[i] = rand;
                        System.out.print(arr[i] + " ");
                    }

                    for (int i = 1; i < arr.length; i++) {
                        if (arr[i - 1] >= arr[i]) {
                            System.out.println("no biger");
                            break;
                        }
                        if (i == arr.length - 1) {
                            System.out.println("bigger");
                        }
                    }
                    break;
                case 7:
                     /* 7. Створіть масив з 20-ти перших чисел Фібоначчі і виведіть його на екран.
                     Нагадуємо, що перший і другий члени послідовності рівні одиницям,
                      а кожен наступний - сумою двох попередніх. */
                    int fib[] = new int[20];
                    for (int i = 0; i < fib.length; i++) {
                        if (i < 2) {
                            fib[i] = 1;
                            System.out.print(fib[i] + " ");
                        } else {
                            fib[i] = fib[i - 2] + fib[i - 1];
                            System.out.print(fib[i] + " ");
                        }
                    }
                    break;
                case 8:
                     /*
                     8. Створіть масив з 12 випадкових цілих чисел з відрізка [-15; 15].
                     Визначте який елемент є в цьому масиві максимальним і повідомте індекс його останнього
                    входження в масив.
                      */
                    int[] arra = new int[12];
                    int max = 0;
                    int count = 0;
                    for (int i = 0; i < arra.length; i++) {
                        Random random = new Random();
                        int rand = random.nextInt() % 16;
                        arra[i] = rand;
                        System.out.print(arra[i] + " ");
                    }
                    for (int i = 0; i < arra.length; i++) {
                        if (max < arra[i]) {
                            max = arra[i];
                        }
                    }
                    System.out.println("max_element =" + max);
                    for (int i = 0; i < arra.length; i++) {
                        count++;
                        if (arra[i] == max) {
                            break;
                        }
                    }
                    System.out.println("count = " + count);
                    break;
                case 9:
                    /*
                    9. Створіть два масиви з 10 цілих випадкових чисел з відрізка [1; 9]
                     і третій масив з 10 дійсних чисел. Кожен елемент з i-им індексом
                     третього масиву повинен дорівнювати відношенню елементу з першого
                     масиву з i-им індексом до елементу з другого масиву з i-им індексом.
                     Вивести всі три масиву на екран (кожен на окремому рядку), потім вивести
                      кількість цілих елементів в третьому масиві.
                     */
                    int araays[] = new int[5];
                    int arrays1[] = new int[5];
                    for (int i = 0; i < araays.length; i++) {
                        Random rnd = new Random();
                        int rd = rnd.nextInt(5);
                        araays[i] = rd;

                        int rd2 = rnd.nextInt(5);
                        arrays1[i] = rd2;
                        System.out.print(araays[i]+" ");
                    }
                    System.out.println();
                    int count_three=0;
                    for (int i = 0; i <arrays1.length ; i++) {
                        System.out.print(arrays1[i]+ " ");
                        if(arrays1[i]==0) {
                            count_three++;
                        }
                    }
                    System.out.println();
                    double array3 [] =new double[5];
                    for (int i = 0; i <array3.length ; i++) {
                        if(count_three>1) {
                            System.out.println("array two have zero");
                            break;
                        }else {
                            array3[i] = araays[i] / arrays1[i];
                            System.out.print(array3[i] + " ");
                        }
                    }
                    break;
                case 10:
                    /*
                    10. Створіть масив з 11 випадкових цілих чисел з відрізка [-1; 1],
                    виведіть масив на екран у рядок. Визначте який елемент зустрічається
                    в масиві найчастіше і виведіть про це повідомлення на екран.
                    Якщо два якихось елемента зустрічаються однакову кількість разів, то не виводьте нічого.
                     */
                    int[] last_arra = new int[11];
                    for (int i = 0; i < last_arra.length; i++) {
                        Random random = new Random();
                        int rand = random.nextInt() % 2;
                        last_arra[i] = rand;
                        System.out.print(last_arra[i] + " ");
                    }
                    int big_zero=0;
                    int same_zero=0;
                    int  lit_zero=0;
                    for (int i = 0; i <last_arra.length ; i++) {
                        if(last_arra[i]==0) {
                            same_zero++;
                        }
                        if (last_arra[i]>0){
                            big_zero++;
                        }
                        if(last_arra[i]<0){
                            lit_zero++;
                        }
                    }

                    for (int i = 0; i <last_arra.length ; i++) {
                        if(lit_zero>same_zero&&lit_zero>big_zero){
                            System.out.println("Are -1");
                            break;
                        }
                        if(same_zero>lit_zero&&same_zero>big_zero){
                            System.out.println("are 0");
                        break;
                        }
                        if(big_zero>same_zero&&big_zero>lit_zero){
                            System.out.println("Are +1");
                        break;
                        }
                        if(big_zero==same_zero||big_zero==lit_zero){
                            System.out.println("big same");
                            break;
                        }
                        if(lit_zero==same_zero||lit_zero==big_zero){
                            System.out.println("little same");
                            break;
                        }
                        if(same_zero==lit_zero||same_zero==big_zero){
                            System.out.println("big same");
                            break;
                        }
                    }

                    break;
                default:
                    System.out.println("Something wrong");

            }
        } else {
            System.out.println("It`s not a number");
        }

    }

}
