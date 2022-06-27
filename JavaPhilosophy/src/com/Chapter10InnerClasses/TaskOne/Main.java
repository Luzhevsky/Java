package com.Chapter10InnerClasses.TaskOne;

class Outer {
    class Inner {
        public String toString() {
            return "ThisIsInner";
        }
    }

    public Inner returnInner() {
        return new Inner();
    }
    public String toString() {
        return "ThisIsOuter";
    }
}

public class Main {
    public static void main(String[] args) {
        Outer o = new Outer();
        System.out.println(o);
        
        Outer.Inner inner = o.returnInner();
        System.out.println(inner);

    }
}
