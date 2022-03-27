package com.Chapter5.InitializationAndCompletion.InitializationStatic;

public class DerivativeString {
    String s;
    Cup cup;

    {
        s = "InitializationInBlock";
        cup = new Cup(1);
        System.out.println(s);
    }


}
