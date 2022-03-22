package com.Chapter5.InitializationAndCompletion.WordThis;

public class Cat {
    String name;
    int age;

    void eatSound(){
        this.eat();
        System.out.print(" работает eatSound");

        System.out.println();

        eat();
        System.out.print(" работает eatSound");
    }
    void eat(){
        System.out.print(this.name + " ест");
    }

    Cat(String name){
        this.name = name;
    }

}
