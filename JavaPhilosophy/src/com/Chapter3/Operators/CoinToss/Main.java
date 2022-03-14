package com.Chapter3.Operators.CoinToss;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(3) + 1;
        if (a == 2){
            System.out.println("Решка");
        } else {
            System.out.println("Орел");
        }
    }
}
