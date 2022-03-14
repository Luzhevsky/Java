package com.company;

public class Cat extends Animal{
    public void eat(){
        System.out.println("Кошки едят еду" + getFood());
    }
    public void makeNoise_s(){
        super.makeNoise();
    }

    public void makeNoise(){
        System.out.println(getName() + " Мяукает ");
    }

    public void game_with_mouse(){
        System.out.println("Кошка играет с мышкой");
    }
}
