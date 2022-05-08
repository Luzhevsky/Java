package com.Chapter8Polymorphism.TaskEight;


import java.util.Random;

class Instrument {
    public void play(Note n){
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

class Wind extends Instrument {
    @Override
    public void play(Note n){
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

class Percussion extends Instrument {
    @Override
    public void play(Note n){
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

class Stinger extends Instrument {
    @Override
    public void play(Note n){
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

class Woodwind extends Wind {
        @Override
        public void play(Note n){
            System.out.println("Woodwind.play() " + n);
        }
        @Override
        public String what(){
            return "Woodwind";
        }

}

class Brass extends Wind {
    @Override
    public void play(Note n){
        System.out.println("Brass.play() " + n);
    }
    @Override
    public String what(){
        return "Brass";
    }

}

class Accordion extends Instrument {
    @Override
    public void play(Note n){
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

class Guitar extends Instrument {
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

class RandomGeneratorInstrument{
    public Instrument generation(){
        Random r = new Random();
        switch (r.nextInt(7)){
            default:
            case 0 : return new Accordion();
            case 1 : return new Wind();
            case 2 : return new Brass();
            case 3 : return new Stinger();
            case 4 : return new Percussion();
            case 5 : return new Guitar();
            case 6 : return new Woodwind();
        }
    }

}


public class Music {

    public static void main(String[] args){

        RandomGeneratorInstrument gen = new RandomGeneratorInstrument();
        for (int i = 0; i < 7; i++) {
            System.out.println(gen.generation());
        }
    }

}
