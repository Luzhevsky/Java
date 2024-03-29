package com.Chapter7.ReuseOfClasses.TaskTwo;

class Cleanser {
    private String s = "Cleanser";
    public void append(String a) { s += a;}
    public void dilute() { append(" dilute()");}
    public void apply() { append(" apply()");}
    public void scrub() { append(" scrub()");}
    public String toString() {return  s;}

}


public class Detergent extends Cleanser{
    public void scrub() {
        append(" Detergent.scrub()");
        super.scrub();
    }
    public void foam() { append(" foam()");}

    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Базовый класс");
        //С помощью синтаксиса ниже мы можем вызвать выполнения функции main из другого класса.
    }
}
