package com.Chapter7.ReuseOfClasses.TaskEight;

public class ClassA {
    ClassA(String s) {
        System.out.println("s = " + s);
        System.out.println("Конструктор класса ClassA");
    }
}
class ClassB extends ClassA {
    ClassB() {
        super("SuperClassB");
        System.out.println("Конструктор класса ClassB");
    }
    ClassB (String s) {
        super("ClassBwithArg");
        System.out.println("Конструктор класса ClassB с аргументом");
    }

    public static void main(String[] args) {
        //Задание 8. Если нет конструктора по умолчанию мы должны в каждом классе наследнике вызвать конструктор родителя.
        ClassB b = new ClassB();
        ClassB b2 = new ClassB("String s");

    }
}


