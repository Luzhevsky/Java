package com.company;

public class Dog extends Animal{


    public void eat(){
        System.out.println("Собака ест " + getFood());
    }
    public void makeNoise(){
        System.out.println("Собака лает");
    }
}
