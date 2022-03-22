package com.Chapter5.InitializationAndCompletion.WordThis;

public class Main {
    public static void main(String[] args) {
        //Задание 8.
        Cat c = new Cat("Мышка");
        c.eatSound();
        System.out.println();
        Dog d = new Dog(10);
        Dog d2 = new Dog("Дик");
        d.ssout();
        d.age = 1;
        d.ssout();
        d2.ssout();
        d2.age = 1;
        d2.ssout();
    }
}
