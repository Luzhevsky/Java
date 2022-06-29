package com.Chapter10InnerClasses.TaskEleven;

public interface InterfaceOne {
    void getName();
}
class Outer {
    String s = "Hello";
    public void method() {
        System.out.println(s);
    }

    public InterfaceOne methodGetLinc() {
        return new InterfaceOne() {
            @Override
            public void getName() {
                System.out.println("Inner");
            }
        };
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