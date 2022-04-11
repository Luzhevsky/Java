package com.Chapter7.ReuseOfClasses.TaskFive;

class A {
    A() {
        System.out.println("Конструктор класса А");
    }
}

class B {
    B() {
        System.out.println("Конструктор класса B");
    }
}

class C extends A {
    B field = new B();
    public static void main(String[] args) {
        //Задание 5. Если мы не используем ссылку на класс B field = new B(); конструктор не вызывается.
        C c = new C();
    }
}

public class D {

}
