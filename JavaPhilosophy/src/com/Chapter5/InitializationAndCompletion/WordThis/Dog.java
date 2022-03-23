package com.Chapter5.InitializationAndCompletion.WordThis;

public class Dog {
    String name;
    int age;
    Dog(String name) {
        this(12);
        this.name = name;
    }
    Dog(int age) {
        this.age = age;
    }
    void ssout(){
        System.out.println(this.name + " " + this.age);
    }
    public String toString123(){
        return name;
    }
    void sthis(){
        System.out.println(this);
    }
}
