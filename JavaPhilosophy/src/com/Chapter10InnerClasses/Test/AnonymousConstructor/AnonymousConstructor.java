package com.Chapter10InnerClasses.Test.AnonymousConstructor;

abstract class Base {
    public Base(int i) {
        System.out.println("Базовый конструктор, i = " + i);
    }
    public abstract void f();
}

public class AnonymousConstructor {
    public static Base getBase(int i) {
        return new Base(i){
            {System.out.println("В инициализаторе экземпляра");}

            @Override
            public void f() {
                System.out.println("В анонимном f()");
            }
        };
    }

    public static void main(String[] args) {
        Base base = getBase(45);
        base.f();
    }
}
