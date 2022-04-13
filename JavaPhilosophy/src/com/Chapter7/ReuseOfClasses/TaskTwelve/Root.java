package com.Chapter7.ReuseOfClasses.TaskTwelve;

class Component1 {
    Component1() {
        System.out.println("Конструктор Component 1");
    }
    void dispose() {
        System.out.println("Завершаем Component1");
    }
}

class Component2 {
    Component2() {
        System.out.println("Конструктор Component 2");
    }
    void dispose() {
        System.out.println("Завершаем Component2");
    }
}

class Component3 {
    Component3() {
        System.out.println("Конструктор Component 3");
    }
    void dispose() {
        System.out.println("Завершаем Component3");
    }
}

public class Root {
    Root() {
        System.out.println("Конструктор Root");
    }
    void dispose() {
        c1.dispose();
        c2.dispose();
        c3.dispose();
        System.out.println("Завершаем Root");
    }
    Component1 c1 = new Component1();
    Component2 c2 = new Component2();
    Component3 c3 = new Component3();
}

class Stem extends Root {
    Stem() {
        System.out.println("Конструктор Steam");
    }
    void dispose() {
        super.dispose();
        System.out.println("Завершаем Steam");
    }
    public static void main(String[] args) {
        //Задание 13.
//        Root r = new Root();
        Stem s = new Stem();
        s.dispose();

    }
}
