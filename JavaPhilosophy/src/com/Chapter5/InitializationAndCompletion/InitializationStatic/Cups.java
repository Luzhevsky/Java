package com.Chapter5.InitializationAndCompletion.InitializationStatic;

public class Cups {
    static Cup cup1;
    static Cup cup2;
    static String a = "This is a";
    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }
    Cups(){
        System.out.println("Cups()");
    }

}
