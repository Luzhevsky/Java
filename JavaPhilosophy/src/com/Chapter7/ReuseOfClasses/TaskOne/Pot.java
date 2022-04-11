package com.Chapter7.ReuseOfClasses.TaskOne;

import com.Chapter7.ReuseOfClasses.*;

public class Pot {
    Soup s = new Soup();
    private String p = "Class P";

    Pot(){
        if(s.getV1() == null) s.setV1("v1 Инициализирована");
        if(s.getV2() == null) s.setV2("v2 Инициализирована");
        System.out.println(s.getV1());
        System.out.println(s.getV2());
        System.out.println(s.getV3());
    }
    public String toString(){
        return p;
    }
    public static void main(String[] args) {
        //Задание 1. Сомнения есть задание немного размыто.
        Pot p = new Pot();
        System.out.println(p);

        for(String a: args){
            System.out.println(a);
        }
    }
}
