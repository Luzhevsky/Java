package com.Chapter7.ReuseOfClasses.Test;

class Cleanser {
    private String s = "Cleanser";
    public void append(String a) { s += a;}
    public void dilute() { append(" dilute()");}
    public void apply() { append(" apply()");}
    public void scrub() { append(" scrub()");}
    public String toString() {return  s;}

    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        System.out.println(x);
    }
}
class Detergent2 extends Cleanser{
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
        System.out.println("Базовый класс2");
        Cleanser.main(args);
    }
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
        Cleanser.main(args);
        System.out.println("Базовый классasdasd");
        Detergent2.main(args);

    }
}
