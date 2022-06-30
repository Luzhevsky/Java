package com.Chapter10InnerClasses.TaskSixteen;

public class Outer {
    static class Nested {

    }
}

class Main {
    public static void main(String[] args) {
        Outer.Nested nested = new Outer.Nested();
        new Outer.Nested();
        System.out.println(nested.getClass().getSimpleName());
    }
}