package com.Chapter7.ReuseOfClasses.TaskSix;

class A {
    A(String a) {
        System.out.println(a + " Конструктор класса А");
    }
}

class B {
    B(String a) {
        System.out.println(a + " Конструктор класса B");
    }
}

class C extends A {
    C(){
        super("Вызываем конструктор A");
        System.out.println("Коструктор класса С");
    }
    B field = new B("в");

}

public class D {
    public static void main(String[] args) {
        //Задание 7.
        C c = new C();
    }
}
