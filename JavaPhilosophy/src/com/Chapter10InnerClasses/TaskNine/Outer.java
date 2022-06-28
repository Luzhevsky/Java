package com.Chapter10InnerClasses.TaskNine;

interface InterfacePublic {
    void getName();
}

public class Outer {

    private class Inner implements InterfacePublic {
        @Override
        public void getName() {
            System.out.println("Inner implements InterfacePublic");
        }
    }

    public InterfacePublic getInner() {
        return new Inner();
    }

}
class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        InterfacePublic interfacePublic = outer.getInner();
        interfacePublic.getName();
       // InterfacePublic interfacePublic1(Inner);
    }
}
