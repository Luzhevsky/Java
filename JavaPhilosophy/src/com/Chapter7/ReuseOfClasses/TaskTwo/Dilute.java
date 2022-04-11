package com.Chapter7.ReuseOfClasses.TaskTwo;

public class Dilute extends Detergent{
    private String s = "Dilute";
    public void dilut(String a){
        s += a;
    }
    @Override
    public void scrub() {
        dilut(" Метод scrub: Класса Dilute");
    }
    public void sterilize(){
        dilut(" sterilize");
    }
    public String toString(){
        return s;
    }

    public static void main(String[] args) {
        Dilute d = new Dilute();
        d.scrub();
        d.sterilize();
        System.out.println(d);
    }
}
