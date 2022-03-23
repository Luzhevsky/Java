package com.Chapter5.InitializationAndCompletion.Finalize;

public class ClassWithMetodFinalize {

    @Override
     protected void finalize(){
         System.out.println("Сообщение");
     }
}
