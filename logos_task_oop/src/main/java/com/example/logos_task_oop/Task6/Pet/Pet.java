package com.example.logos_task_oop.Task6.Pet;
/*
Написати клас абстрактний Pet ,
в якому описати абстрактний метод voice().
Створити класи Cow, Cat, Dog ,
які наслідуються від Pet. Перевизначити в них метод
voice(), так, щоб викликаючи його в методі main,
 на консоль виводилось : “Я кіт-
Мяууу-Мяууу”, “Я пес- Гаууу-Гаууу”, “Я корова- Мууу-Мууу”.
 */
public abstract class Pet {

    void voice (){
        System.out.println("I`m a pet");
    }

}
