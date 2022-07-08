package com.Chapter11Collections.TaskOne;

public class Gerbil { //песчанка
    int gerbilNumber;
    Gerbil (int gerbilNumber){
        this.gerbilNumber = gerbilNumber;
    }
    public void hop() { //прыгать
        System.out.println(gerbilNumber + " hello");
    }
}
