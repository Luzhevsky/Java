package com.company;

public class Vet {
    public void giveCure(Animal a){
        a.eat();
        System.out.println("Лечим животное с именем " + a.getName());
        a.makeNoise();
    }
}
