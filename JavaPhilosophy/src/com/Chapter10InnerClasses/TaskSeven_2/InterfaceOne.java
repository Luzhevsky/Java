package com.Chapter10InnerClasses.TaskSeven_2;

public interface InterfaceOne {
    void getName();
}
class Outer {
    String s = "hello";
    public void method() {
        System.out.println(s);
    }

    public InterfaceOne methodGetLinc() {
        class Inner implements InterfaceOne{
            public void getName() {
                System.out.println("Inner");
            }
        }
        return new Inner();
    }


}

class Main {
    public static void main(String[] args) {
        Outer o = new Outer();
        System.out.println(o);
        o.method();
        InterfaceOne interfaceOne = o.methodGetLinc();
        interfaceOne.getName();
    }
}