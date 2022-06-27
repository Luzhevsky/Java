package com.Chapter10InnerClasses.TaskThree;

class Outer {
    private String s;

    Outer (String s) {
        this.s = s;
    }

    class Inner {
        public String toString() {
            return s;
        }
    }

    public Inner returnInner() {
        return new Inner();
    }
}

public class Main {
    public static void main(String[] args) {
        Outer o = new Outer("123");
        Outer.Inner inner = o.returnInner();
        System.out.println(inner);

    }
}
