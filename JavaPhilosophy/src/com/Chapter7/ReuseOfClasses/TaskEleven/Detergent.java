package com.Chapter7.ReuseOfClasses.TaskEleven;

import com.Chapter7.ReuseOfClasses.TaskSix.D;

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

class Delegation{
    private String name;
    Delegation(String name){
        this.name = name;
    }
    Cleanser c = new Cleanser();
    public void scrub() {
        c.scrub();
        System.out.println("Используем метод scrub класса Cleanser");
    }
    public void apply() {
        c.apply();
        System.out.println("Используем метод apply класса Cleanser");;
    }

    public static void main(String[] args) {
        //Делегирование мы использовали(переопределяем все) функции класса Cleanser для создания своих методов. Явно в java нет.
        Delegation d = new Delegation("Мыть");
        d.apply();
        d.scrub();
    }
}