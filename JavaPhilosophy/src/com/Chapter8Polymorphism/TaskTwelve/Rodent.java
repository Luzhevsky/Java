package com.Chapter8Polymorphism.TaskTwelve;

import java.util.Random;

/** Rodent - Грызуны
 *
 */
public class Rodent {

    /** Грызун что-то грызет.
     *
     */
    public void gnaw(){
        System.out.println("Грызун грызет. (Метод gnow() Класса Rodent).");
    }

    /** Грызун бежит.
     *
     */
    public void run(){
        System.out.println("Грызун бежит. (Метод run() Класса Rodent).");
    }
}

class Mouse extends Rodent {
    @Override
    public void gnaw(){
        System.out.println("Мышь грызет. (Метод gnow() Класса Mouse).");
    }
    @Override
    public void run(){
        System.out.println("Мышь бежит. (Метод run() Класса Mouse).");
    }
}

class Hamster extends Rodent {
    @Override
    public void gnaw(){
        System.out.println("Хомяк грызет. (Метод gnow() Класса Hamster).");
    }
    @Override
    public void run(){
        System.out.println("Хомяк бежит. (Метод run() Класса Hamster).");
    }
}

class Chinchilla extends Rodent {
    @Override
    public void gnaw(){
        System.out.println("Шиншила грызет. (Метод gnow() Класса Chinchilla).");
    }
    @Override
    public void run(){
        System.out.println("Шиншила бежит. (Метод run() Класса Chinchilla).");
    }
}

class GetRandomHeir {
    Random r = new Random();
    public Rodent getR(){
        switch (r.nextInt(3)){
            default :
            case 0: return new Mouse();
            case 1: return new Hamster();
            case 2: return new Chinchilla();

        }
    }
}

class Main {
    public static void main(String[] args) {
        GetRandomHeir getrandom = new GetRandomHeir();

        Rodent[] rodent = new Rodent[5];
        for (int i = 0; i < rodent.length; i++) {
            rodent[i] = getrandom.getR();
        }

        for(Rodent r : rodent){
            r.run();
            r.gnaw();
        }


    }
}
