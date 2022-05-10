package com.Chapter8Polymorphism.TaskTen;

public class A {
    public void methodOne(){
        methodTwo();
        System.out.println("A.MethodOne");
    }
    public void methodTwo(){
        System.out.println("A.MethodTwo");
    }
}

class B extends A {
    @Override
    public void methodTwo(){
        System.out.println("B.MethodTwo Метод  methodTwo Класса B");
    }
}

class Main{
    public static void main(String[] args) {
        B b = new B();
        A b2 = b;

        b2.methodOne();//Смысл понятен.
    }
}