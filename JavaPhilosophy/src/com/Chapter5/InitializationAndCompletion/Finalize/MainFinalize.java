package com.Chapter5.InitializationAndCompletion.Finalize;

public class MainFinalize {
    public static void main(String[] args) {
        //Задание 10.
        ClassWithMetodFinalize c = new ClassWithMetodFinalize();
        c.finalize();
        Tank t = new Tank(true);
        t.checkIn();
        new Tank(true);
        System.gc();

    }
}
