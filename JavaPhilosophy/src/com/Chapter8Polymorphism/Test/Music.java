package com.Chapter8Polymorphism.Test;


class Instrument {
    public void play(Note n){
        System.out.println("Instrument.play()");
    }
}

class Wind extends Instrument {
    @Override
    public void play(Note n){
        System.out.println("Wind.play() " + n);
    }
}

class Accordion extends Instrument {
    @Override
    public void play(Note n){
        System.out.println("Accordion() " + n);
    }
}

class Guitar extends Instrument {
    @Override
    public void play(Note n) {
        System.out.println("Guitar() " + n);
    }
}

public class Music {

    public static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args){
        Wind flute = new Wind();
        tune(flute);
        tune(new Guitar());
        tune(new Accordion());
        
    }

}
