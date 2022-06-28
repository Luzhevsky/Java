package com.Chapter10InnerClasses.TaskTen;

public class FieldAndMethod {
    private String field = "FieldOne";

    private void method() {
        String s = "method()";
        System.out.println(s);
        System.out.println(field);
    }

    public Destination destination() {
        return new Destination() {
            {
                field = "FieldTwo";
                method();
            }
            @Override
            public void readLabel() {
                System.out.println(field);
            }
        };
    }

    public static void main(String[] args) {
        FieldAndMethod fieldAndMethod = new FieldAndMethod();
        fieldAndMethod.method();
        fieldAndMethod.destination();
    }
}