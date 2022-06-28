package com.Chapter10InnerClasses.Test;


//Мы можем изменить приватные свойства через внутрунний класс.
public class Outer {
    private int i = 5;
    private String s ="Hello";


    class Inner {
        public void method(int im, String sm) {
           i = im;
            s = sm;
        }
    }

    public void ss(){
        System.out.println(i);
        System.out.println(s);
    }
}

class Main {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.ss();
        Outer.Inner inner= o.new Inner();
        inner.method(0,"hello2");
        o.ss();
    }
}
