package com.Chapter5.InitializationAndCompletion.MethodOverloading;

public class DefaultConstructor {
    DefaultConstructor(){
        System.out.println("DefaultConstructor");
    }
    DefaultConstructor(String s){
        System.out.println(s + " ConstructorWithParameters");
    }
}
