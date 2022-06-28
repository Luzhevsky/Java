package com.Chapter10InnerClasses.TaskEight;

public class Outer {
    //Нужно создать экземпляр класс, чтобы иметь доступ к приватным членам.
    private Inner in = new Inner();
    public void method2() {
        in.i = 34;
        in.s = "InnerUpdate";
        in.method();
    }

    public void method1() {
        in.method();

    }

   private class Inner {
        private int i = 4;
        private String s = "Inner";
        public void method() {
            System.out.println(i);
            System.out.println(s);
        }
    }
}

class Main {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.method1();
        o.method2();

    }
}