package com.Chapter10InnerClasses.TaskSeventeen;

public class Outer {
    static class Nested {
        static class Nested2{

        }
    }
}

class Outer2 {
    class Inner {
        class Inner2 {

        }
    }
}

class Main {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Nested on = new Outer.Nested();
        Outer.Nested.Nested2 on2 = new Outer.Nested.Nested2();
        System.out.println(o.getClass().getSimpleName());
        System.out.println(on.getClass().getSimpleName());
        System.out.println(on2.getClass().getSimpleName());

        Outer2 o2 = new Outer2();
        Outer2.Inner o2i = o2.new Inner();
        Outer2.Inner.Inner2 o2i2 = o2i.new Inner2();
        System.out.println(o2.getClass().getSimpleName());
        System.out.println(o2i.getClass().getSimpleName());
        System.out.println(o2i2.getClass().getSimpleName());



    }
}