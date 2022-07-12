package com.Chapter11Collections.TaskEight;

import java.util.ArrayList;
import java.util.Iterator;

public class Gerbil { //песчанка
    int gerbilNumber;
    Gerbil (int gerbilNumber){
        this.gerbilNumber = gerbilNumber;
    }
    public void hop() { //прыгать
        System.out.println(gerbilNumber + " hello");
    }
}

class Main {
    public static void main(String[] args) {
        ArrayList<Gerbil> gerbil = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            gerbil.add(new Gerbil(i));
        }
        Iterator<Gerbil> it = gerbil.iterator();
        while(it.hasNext()){
            Gerbil ger = it.next();
            ger.hop();
        }
    }
}
