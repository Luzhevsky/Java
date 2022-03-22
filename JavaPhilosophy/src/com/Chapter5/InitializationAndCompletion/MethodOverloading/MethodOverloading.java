package com.Chapter5.InitializationAndCompletion.MethodOverloading;

public class MethodOverloading {
    public static void main(String[] args) {
        //Задание 1.
        NotInitialization n = new NotInitialization();
        System.out.println(n.str);
        //Задание 2.
        InitializationString init = new InitializationString();
        System.out.println(init.ss);
        System.out.println(init.si);
        //Задание 3.
        DefaultConstructor constdef = new DefaultConstructor();
        //Задание 4.
        DefaultConstructor constructor = new DefaultConstructor("Constructor");
    }
}
