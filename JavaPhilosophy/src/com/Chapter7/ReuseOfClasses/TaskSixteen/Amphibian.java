package com.Chapter7.ReuseOfClasses.TaskSixteen;

public class Amphibian {
    private String name;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void swim() {
        System.out.println(this.name + " плывет");
    }
    public void walk() {
        System.out.println(this.name + " Двигается");
    }

    public void head(Amphibian name){
        System.out.println("Голова " + name.getName());
    }

}
class Triton extends Amphibian{

}

class Frog extends Amphibian {
    //Задание 17. При переопределение метода вызватся будут переопределенные методы
//    public void swim() {
//        System.out.println("Метод Swim Класса Frog");
//    }
//    public void walk(){
//        System.out.println("Метод walk Класса Frog");
//    }


    public static void main(String[] args) {
        Triton t = new Triton();
        t.setName("Тритон");

        Frog f = new Frog();
        f.setName("Frog");
        f.swim();
        f.walk();


        System.out.println();
        Amphibian a = new Frog();
        a.setName("Амфибия");
        a.swim();
        a.walk();


        System.out.println();
        System.out.println(f instanceof Frog);
        System.out.println(f instanceof Amphibian);

        System.out.println(a instanceof Frog);
        System.out.println(a instanceof Amphibian);

        System.out.println("\nАморфные типы");
        Amphibian amp = new Amphibian();
        amp.head(f);
        amp.head(t);

    }

}
