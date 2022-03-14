package com.company;

public abstract class Animal {
    private String food = "Еда для животных";
    private String name = "Животное";

    public String getFood(){
        return this.food;
    }

    public void setFood(String food){
        this.food = food;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }


    abstract public void eat();

    public void makeNoise(){
        System.out.println("Животное издает звук который трудно воспроизвести");
    }

}
