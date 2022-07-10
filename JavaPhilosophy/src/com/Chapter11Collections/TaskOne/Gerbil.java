package com.Chapter11Collections.TaskOne;

import java.util.ArrayList;

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
        for (int i = 0; i < gerbil.size(); i++) {
            gerbil.get(i).hop();
        }
    }
}
