package com.Chapter3.Operators.SpeedCalculation;

import java.util.Random;

public class SpeedCalculation {
    public static void main(String[] args) {
        Random rand = new Random(25);
        int t = rand.nextInt(100) + 1;
        int s = rand.nextInt(1000) + 1;
        int u = s / t;
        System.out.println("Врмея движения машины " + t);
        System.out.println("Рассотяник которое пройдет машины " + s);
        System.out.println("Скорость движения машины " + u);

    }
}
