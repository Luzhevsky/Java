package com.Chapter5.InitializationAndCompletion.VariableLengthArguments;

public class VariableLengthArg {
    public static void f(String... args){
//        System.out.println("Аргументы переменной длины типа Массив String[]");
//        for(String array : a ){
//            System.out.println(array);
//        }
//        System.out.println("Аргументы переменной длины типа String");
        System.out.println();
        for(String obj: args){
            System.out.print(obj + " ");
        }
    }

    public static void f2(String[] a, String... args){
        System.out.println("Аргументы переменной длины типа Массив String[]");
        for(String array : a){
            System.out.print(array + " ");
        }
        System.out.println();
        System.out.println("Аргументы переменной длины типа String");
        for(String obj: args){
            System.out.print(obj + " ");
        }
    }
    public static void main(String[] args) {
        //Задание 19.
        f(new String[]{"a", "b", "c"});
        f(new String("d"), new String("r"));
        f("v", "n", "m");
        System.out.println();
        System.out.println();
        System.out.println("Далее метод f2");
        f2(new String[]{"a", "d" ,"d"}, "abc", "ddd", "fff");
    }
}
