package com.Chapter8Polymorphism.TaskSeven;

public class FieldAndMethod {
    private String field = "FieldOne";

    private void method() {
        String s = "method()";
        System.out.println(s);
        System.out.println(field);
    }

    public void method2() {
        PrivateChange p = new PrivateChange();
        p.privateChange();
    }

    class PrivateChange {
        public void privateChange() {
            field = "FieldTwo";
            method();
        }
    }

    public static void main(String[] args) {
        FieldAndMethod f = new FieldAndMethod();
        f.method();
        f.method2();
    }
}
