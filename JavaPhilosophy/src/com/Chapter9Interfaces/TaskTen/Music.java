package com.Chapter9Interfaces.TaskTen;


import com.Chapter8Polymorphism.TaskEight.Note;

import java.util.Random;

interface Playable {
    void play(Note n);
}

class Instrument implements Playable{
    public void play(com.Chapter8Polymorphism.TaskEight.Note n){
        System.out.println("Instrument.play()");
    }
    public String what(){
        return "Instrument";
    }
    public void adjust(){
        System.out.println("Adjusting Instrument");
    }
    public String toString(){
        return what();
    }
}



class Wind extends Instrument implements Playable{
    @Override
    public void play(com.Chapter8Polymorphism.TaskEight.Note n){
        System.out.println("Wind.play() " + n);
    }
    @Override
    public String what(){
        return "Wind";
    }
    @Override
    public void adjust(){
        System.out.println("Adjusting Wind");
    }
}

class Percussion extends Instrument implements Playable{
    @Override
    public void play(com.Chapter8Polymorphism.TaskEight.Note n){
        System.out.println("Percussion.play() " + n);
    }
    @Override
    public String what(){
        return "Percussion";
    }
    @Override
    public void adjust(){
        System.out.println("Adjusting Percussion");
    }
}

class Stinger extends Instrument implements Playable{
    @Override
    public void play(com.Chapter8Polymorphism.TaskEight.Note n){
        System.out.println("Stringer.play() " + n);
    }
    @Override
    public String what(){
        return "Stringer";
    }
    @Override
    public void adjust(){
        System.out.println("Adjusting Stringer");
    }
}

class Woodwind extends Wind implements Playable{
        @Override
        public void play(com.Chapter8Polymorphism.TaskEight.Note n){
            System.out.println("Woodwind.play() " + n);
        }
        @Override
        public String what(){
            return "Woodwind";
        }

}

class Brass extends Wind implements Playable{
    @Override
    public void play(com.Chapter8Polymorphism.TaskEight.Note n){
        System.out.println("Brass.play() " + n);
    }
    @Override
    public String what(){
        return "Brass";
    }

}

class Accordion extends Instrument implements Playable{
    @Override
    public void play(com.Chapter8Polymorphism.TaskEight.Note n){
        System.out.println("Accordion() " + n);
    }
    @Override
    public String what(){
        return "Accordion()";
    }
    @Override
    public void adjust(){
        System.out.println("Adjusting Accordion");
    }

}

class Guitar extends Instrument implements Playable{
    @Override
    public void play(Note n) {
        System.out.println("Guitar() " + n);
    }
    @Override
    public String what(){
        return "Guitar";
    }
    @Override
    public void adjust(){
        System.out.println("Adjusting Guitar");
    }

}




public class Music {
    public static void tune(Playable p){
        p.play(Note.C_SHARP);
    }

    public static void main(String[] args){
        //Можем создать интерфейс с одним методом для вызова его у всех классов.
        tune(new Guitar());
        tune(new Stinger());
        tune(new Accordion());
        tune(new Brass());
        tune(new Woodwind());
        tune(new Wind());
        tune(new Percussion());

    }
}
