package com.Chapter7.ReuseOfClasses.TaskNine;

class Component1 {
    Component1() {
        System.out.println("Класс Component 1");
    }
}

class Component2 {
    Component2() {
        System.out.println("Класс Component 2");
    }
}

class Component3 {
    Component3() {
        System.out.println("Класс Component 3");
    }
}

public class Root {
    Root() {
        System.out.println("Класс Root");
    }
    Component1 c1 = new Component1();
    Component2 c2 = new Component2();
    Component3 c3 = new Component3();
}

class Stem extends Root {

    Stem() {
        System.out.println("Класс Steam");
    }
    public static void main(String[] args) {
        //Задание 9. Если мы объявили экземпляры классов в родители, то наследник получит к ним доступ.
//        Root r = new Root();
        Stem s = new Stem();

    }
}
