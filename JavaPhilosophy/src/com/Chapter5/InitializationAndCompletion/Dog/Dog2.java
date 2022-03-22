package com.Chapter5.InitializationAndCompletion.Dog;

public class Dog2 {
    void bark(String s, int n){
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println(s);
        }
    }
    void bark(int n, String s){
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println(s);
        }
    }
}
