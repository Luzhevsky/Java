package com.Chapter3.Operators.AliasingMethod;

public class PassObject {
    public static void f(FloatNumber fn){
        fn.f = 25.2f;
    }

    public static void main(String[] args) {
        FloatNumber ff = new FloatNumber();
        ff.f = 16.2f;
        System.out.println("1: ff.f = " + ff.f);
        f(ff);
        System.out.println("2. ff.f = " + ff.f);
    }
}
