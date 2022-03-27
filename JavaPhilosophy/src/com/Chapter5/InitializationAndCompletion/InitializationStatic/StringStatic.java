package com.Chapter5.InitializationAndCompletion.InitializationStatic;

public class StringStatic {
    static String s = "StringStatic";
    static String stat;
    static {
        stat = "stringInitializationInBlockStatic";
    }
    static void f(){
        System.out.println(s);
        System.out.println(stat);
    }
}
