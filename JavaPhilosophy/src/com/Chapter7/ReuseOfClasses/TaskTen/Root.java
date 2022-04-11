package com.Chapter7.ReuseOfClasses.TaskTen;

class Component1 {
    Component1(String s) {
        System.out.println(s + " Класс Component 1");
    }
}

class Component2 {
    Component2(String s) {
        System.out.println(s + " Класс Component 2");
    }
}

class Component3 {
    Component3(String s) {
        System.out.println(s + " Класс Component 3");
    }
}

public class Root {
    Root(String s) {
        System.out.println(s + " Класс Root");
    }
    Component1 c1 = new Component1("comp1");
    Component2 c2 = new Component2("comp2");
    Component3 c3 = new Component3("comp3");
}

class Stem extends Root {

    Stem(String s) {
        super("SuperfromStem");
        System.out.println(s + " Класс Steam");
    }


    public static void main(String[] args) {
        //Задание 10.
        Stem s = new Stem("stem");
    }
}
