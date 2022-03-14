package com.company;

import jdk.jfr.StackTrace;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.*;
import java.lang.StackTraceElement;
import static java.lang.StackTraceElement.*;

public class Main {

    public static void main(String[] args) throws Exception {


        System.out.println("/////// Кошка //////////");
        Cat cat = new Cat();
        cat.setFood("Вискас");
        cat.setName("Мышка");
        System.out.println(cat.getName() + " ест " + cat.getFood());
        //Вызовим методы
        cat.makeNoise();
        cat.eat();
        //вызываем метод с родительским свойством.
        cat.makeNoise_s();

        System.out.println("/////// СОбака //////////");
        Dog dog = new Dog();
        dog.setName("Дик");
        dog.setFood("Педигри");
        System.out.println(dog.getName() +" ест " + dog.getFood());
        dog.eat();
        dog.makeNoise();

        System.out.println("/////// Полиморфный массив //////////");

        Animal animal1 = new Dog();
        animal1.eat();
        animal1.makeNoise();
        System.out.println("/////// Лечим животное //////////");
        Vet vet = new Vet();
        vet.giveCure(dog);
    }
}

