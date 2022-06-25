package com.Chapter9Interfaces.TaskNineteen;

import java.util.Random;

interface Toss {
    int toss();
}

interface TossFactory {
    Toss getToss();
}

class CoinToss implements Toss {
    Random r = new Random();

    public int toss() {
        return r.nextInt(2);

    }
}

class CoinTossFactory implements TossFactory {
    public Toss getToss(){
        return new CoinToss();
    }
}

class CubeToss implements Toss {
    Random r = new Random();

    public int toss() {
        return r.nextInt(6) + 1;

    }
}

class CubeTossFactory implements TossFactory {
    public Toss getToss() {
        return new CubeToss();
    }
}

public class Main {
    public static void getToss(TossFactory tossFactory) {
        Toss t = tossFactory.getToss();
        System.out.println(t.toss());
    }
    public static void main(String[] args) {
        System.out.println("Бросаем монету");
        getToss(new CoinTossFactory());
        System.out.println("Бросаем Кубик");
        getToss(new CubeTossFactory());
    }
}