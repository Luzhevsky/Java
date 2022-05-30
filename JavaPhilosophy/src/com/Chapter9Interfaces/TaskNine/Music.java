package com.Chapter9Interfaces.TaskNine;

import java.util.Random;

interface Instrument {
    int VALUE = 5;
    void play(Note n);
    void adjust();
}

abstract class PlayAnInstrument {

    public void play(Note n){
        System.out.println(this + ".play() " + n);
    }

    public void adjust(){
        System.out.println(this + ".adjust()");
    }
}

class Wind extends PlayAnInstrument implements Instrument {
    public String toString(){
        return "Wind";
    }
}

class Percussion extends PlayAnInstrument implements Instrument {
    public String toString(){
        return "Percussion";
    }
}

class Stinger extends PlayAnInstrument implements Instrument {
    public String toString(){
        return "Stinger";
    }
}

class Woodwind extends Wind {
    public String toString(){
        return "Woodwind";
    }
}

class Brass extends Wind {
    public String toString(){
        return "Brass";
    }
}

class Accordion extends PlayAnInstrument implements Instrument {
    public String toString(){
        return "Accordion";
    }
}

class Guitar extends PlayAnInstrument implements Instrument {
    public String toString(){
        return "Guitar";
    }
}

//class RandomGeneratorInstrument {
//    public Instrument generation(){
//        Random r = new Random();
//        switch (r.nextInt(7)){
//            default:
//            case 0 : return new Accordion();
//            case 1 : return new Wind();
//            case 2 : return new Brass();
//            case 3 : return new Stinger();
//            case 4 : return new Percussion();
//            case 5 : return new Guitar();
//            case 6 : return new Woodwind();
//        }
//    }
//
//}


public class Music {

    static void tune(Instrument i) {
        i.play(Note.C_SHARP);
    }

    static void tuneAll(Instrument[] e) {
        for (Instrument i: e){
            tune(i);
        }
    }

    public static void main(String[] args){

        Instrument[] instruments = {
            new Wind(),
            new Percussion(),
            new Stinger(),
            new Brass(),
            new Woodwind(),
            new Accordion(),
            new Guitar()
        };

        tuneAll(instruments);
    }

}
