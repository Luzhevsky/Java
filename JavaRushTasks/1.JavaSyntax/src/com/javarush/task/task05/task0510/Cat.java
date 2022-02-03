package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    String name;
    int weight;
    int age;
    String color;
    String address;
    
    public Cat(){
        this.weight = 5;
        int age = 2;
        String color = "black";
    }
    public void initialize(String name){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }
    public void initialize(String name, int age, int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }
    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
    }public void initialize(int weight, String color){
        this.weight = weight;
        this.color = color;
        this.age = age;
    }public void initialize(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
    }
    public void initialize(String name, int age, int weight, String color){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }
    public void initialize(int age, int weight, String color, String address){
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        System.out.println(cat2.age);
        cat1.initialize("tima");
        System.out.println(cat1.name + " " + cat1.age + " " + cat1.weight + " " + cat1.color);
    }
}
