package com.Chapter2.EverythingIsAnObject.overloading.test;

public class ATypeName {
    public static void type(Object var){
        if (var instanceof String){
            System.out.println("Тип переменной String");
        } else if (var instanceof Character){
            System.out.println("Тип переменной Char");
        }  else if (var instanceof Double) {
            System.out.println("Тип переменной Double");
        } else if (var instanceof Float){
            System.out.println("Тип переменной Float");
        } else if (var instanceof Long){
            System.out.println("Тип переменной Long");
        } else if (var instanceof Integer){
            System.out.println("Тип переменной Integer");
        } else if (var instanceof Short){
            System.out.println("Тип переменной Short");
        } else if (var instanceof Byte){
            System.out.println("Тип переменной Byte");
        } else if (var instanceof Boolean) {
            System.out.println("Тип переменной boolean");
        } else {
            System.out.println("Тип переменной Object");
        }
    }
}
