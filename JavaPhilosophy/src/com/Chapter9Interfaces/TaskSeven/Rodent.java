package com.Chapter9Interfaces.TaskSeven;

import java.util.Random;

/** Rodent - Грызуны
 *
 */
interface Rodent {
    public void gnaw();//Грызть
    public void run();//Бежать
}

class Mouse implements Rodent {
    @Override
    public void gnaw(){
        System.out.println("Мышь грызет. (Метод gnow() Класса Mouse).");
    }
    @Override
    public void run(){
        System.out.println("Мышь бежит. (Метод run() Класса Mouse).");
    }
}

class Hamster implements Rodent {
    @Override
    public void gnaw(){
        System.out.println("Хомяк грызет. (Метод gnow() Класса Hamster).");
    }
    @Override
    public void run(){
        System.out.println("Хомяк бежит. (Метод run() Класса Hamster).");
    }
}

class Chinchilla implements Rodent {
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
