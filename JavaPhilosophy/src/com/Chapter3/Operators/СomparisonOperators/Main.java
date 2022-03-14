package com.Chapter3.Operators.СomparisonOperators;

public class Main {
    public static void main(String[] args) {
        Dog spot = new Dog();
        spot.setName("spot");
        spot.setSays("hello_ I am spot");
        System.out.println(spot.getName() + " " + spot.getSays());

        Dog scruffy = new Dog();
        scruffy.setName("scruffy");
        scruffy.setSays("hello_I am scruffy");
        System.out.println(scruffy.getName() + " " + scruffy.getSays());

        Dog dog = new Dog();
        dog = spot;
        System.out.println(dog == spot);
        System.out.println(dog.equals(spot));
    }
}
