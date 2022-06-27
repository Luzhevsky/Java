package com.Chapter10InnerClasses.TaskFive;

public class Outer {
    class Inner {
        public String toString() {
            return "Inner";
        }
    }

    public String toString() {
        return "Outer";
    }
}

class Main {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner oI = o.new Inner();
        System.out.println(o);
        System.out.println(oI);
    }
}
