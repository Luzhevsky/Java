package com.Chapter5.InitializationAndCompletion.Dog;

public class Dog {
    void bark(){
        System.out.println("Лай");
    }
    void bark(String s){
        System.out.println(s + "Гав");
    }
    void bark(int n){
        System.out.println();
        System.out.println("Вой n=" + n + " раз ");
        for (int i = 0; i < n; i++) {
            System.out.print("Вой ");
        }
    }
    void bark(short n){
        System.out.println();
        System.out.println("Поскуливание n=" + n + " раз ");
        for (int i = 0; i < n; i++) {
            System.out.print("Поскуливание ");
        }
    }
    void bark(long n){
        System.out.println();
        System.out.println("Рык n=" + n + " раз ");
        for (int i = 0; i < n; i++) {
            System.out.print("Рык ");
        }
    }
}
