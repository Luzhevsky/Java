package com.Chapter5.InitializationAndCompletion.Dog;

public class Main {
    public static void main(String[] args){
        //Задание 5
        Dog d = new Dog();
        d.bark();
        d.bark("Собака ");
        d.bark(5);
        d.bark((short) 7);
        d.bark((long) 24);
        //Задание 6.
        Dog2 d2 = new Dog2();
        d2.bark("Лай", 5);
        d2.bark(3, "Гав");
        //Задание 7.
        NoConstructor n = new NoConstructor();
        System.out.println(n);
    }
}
