package com.Chapter6.AccessControl.debugoff;

import com.Chapter6.AccessControl.debug.ClassWithProtected;

public class ClassWithDifferentControl {
    private String Address = "Красная 22";
    protected String Email = "Twstd2345@mail.ru";
    String name = "Mark";
    public String NicName = "Admiral33";

    private void userData(){
        System.out.println(Address + ", " + Email + ", " + name + ", " + NicName);
    }
    protected void userEmail(){
        System.out.println("EmailUser = " + Email);
    }
    void userName(){
        System.out.println("NameUser = " + name);
    }
    public void nicName(){
        System.out.println("NicName = " + name);
    }
    public void ClassWorkWithProtectedVariables(){
        ClassWorkWithProtectedVariables pr = new ClassWorkWithProtectedVariables();
        System.out.println("Protected переменные");
        pr.printProtectedVariables();
    }
}

class ClassWorkWithProtectedVariables {
    ClassWithDifferentControl deff = new ClassWithDifferentControl();
    public void printProtectedVariables(){
        deff.userEmail();
        deff.userName();
        deff.nicName();
    }
}


