package com.Chapter9Interfaces.TaskFive.RealizationInterface;

import com.Chapter9Interfaces.TaskFive.Interface.*;

class Client implements Person {
    private String name = "Client ";
    @Override
    public void buy() {
        System.out.println(name + "Купил");
    }

    @Override
    public void reviews() {
        System.out.println(name + "Оставил отзыв");
    }

    @Override
    public void visit() {
        System.out.println(name + "Посетил");
    }

    public String toString(){
        return "Client";
    }
}

class Employee implements Person{
    private String name = "Person ";
    @Override
    public void reviews() {
        System.out.println(name + "Оставил отзыв");
    }

    @Override
    public void buy() {
        System.out.println(name + "Купил");
    }

    @Override
    public void visit() {
        System.out.println(name + "Посетил");
    }
}


public class Main {

    public static void getInfoPerson(Person p){
        p.buy();
        p.reviews();
        p.visit();
    }

    public static void main(String[] args) {
        Person c = new Client();
        getInfoPerson(c);
        getInfoPerson(new Employee());

    }
}
