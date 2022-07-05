package com.Chapter10InnerClasses.Test.Callbacks;

interface Incrementable { //увеличиваемый
    void increment();
}
/**
    Реализуем интерфейс Incrementable в классе Calee1.
    Изменим переменную i.
 */
class Callee1 implements Incrementable { //вызов
    private int i = 0;

    @Override
    public void increment() {
        i++;
        System.out.println(i);
    }
}

/**
 * Создаем класс MyIncrement с двумя методами
 * Метод f вызывает метод increment Класса MyIncrement
 */
class MyIncrement {
    public void increment() {
        System.out.println("Другая операция");
    }
    public static void f(MyIncrement mi) {
        mi.increment();
    }
}

class Callee2 extends MyIncrement {
    private int i = 0;
    public void increment() {
        super.increment();
        i++;
        System.out.println(i);
    }
    private class Closure implements Incrementable {
        @Override
        public void increment() {
            Callee2.this.increment();
        }
    }
    Incrementable getCallbackReference() {
        return new Closure();
    }
}

class Caller {
    private Incrementable callbackReference;
    Caller(Incrementable cbh) {
        callbackReference = cbh;
    }
    void go() {
        callbackReference.increment();
    }
}

public class Callback {
    public static void main(String[] args) {
        Callee1 c1 = new Callee1();
        Callee2 c2 = new Callee2();
        MyIncrement.f(c2);
        Caller caller1 = new Caller(c1);
        Caller caller2 = new Caller(c2.getCallbackReference());
        caller1.go();
        caller1.go();
        caller2.go();
        caller2.go();

    }
}
