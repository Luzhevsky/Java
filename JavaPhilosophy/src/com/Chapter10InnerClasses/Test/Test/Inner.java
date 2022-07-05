package com.Chapter10InnerClasses.Test.Test;

public class Inner {
    private int i = 5;
    class Outer {
        Outer(int a) {
            i = a;
            System.out.println(i);
        }
    }
    public void getI(){
        System.out.println(i);
    }
}
class Main {
    public static void main(String[] args) {
        Inner inner = new Inner();
        inner.getI();
        Inner.Outer innerOuter = inner.new Outer(3);
        inner.getI();
    }
}
