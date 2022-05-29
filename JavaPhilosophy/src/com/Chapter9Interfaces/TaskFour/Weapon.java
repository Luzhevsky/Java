package com.Chapter9Interfaces.TaskFour;

public abstract class Weapon { //Оружие
    abstract void description(String s);
}

class CivilianWeapons extends Weapon { //Гражданское оружие
    public void description(String s) {
        System.out.println(s);
    }

    public static void getLink(Weapon w){
        System.out.println("Weapon " + w);
    }

    public String toString() {
        return "CivilianWeapons";
    }
}

class ServiceWeapons extends Weapon { //Служебное оружие
    public void description(String s) {
        System.out.println(s);
    }

    public static void getLink(Weapon w){
        System.out.println("Weapon " + w);
    }

    public String toString() {
        return "Weapon";
    }
}

class ColdWeapons extends Weapon { //Холодное оружие
    public void description(String s) {
        System.out.println(s);
    }

    public static void getLink(Weapon w){
        System.out.println("Weapon " + w);
    }
}

class Main {
    public static void main(String[] args) {
        Weapon w = new CivilianWeapons(); //Восходящее преобразование
        CivilianWeapons c = (CivilianWeapons)w; //Нисходящие преобразование для вызова метода
        c.description("hello");
        CivilianWeapons.getLink(c);
        //Добавим метод abstract в базовый класс. Теперь можно сделать так, и не делать нисходящее преобразование
        w.description("hello after add abstract");
        CivilianWeapons.getLink(w);
    }
}