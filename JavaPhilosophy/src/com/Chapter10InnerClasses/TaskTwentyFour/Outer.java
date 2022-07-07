package com.Chapter10InnerClasses.TaskTwentyFour;

public class Outer {
    public class Inner {
        public Inner (int i) {
            System.out.println(i);
        }
    }
}

class Outer2 {
    class Inner2 extends Outer.Inner {
        public Inner2(Outer outer) {
            outer.super(23);
        }

    }
}