package com.Chapter10InnerClasses.TaskFifteen;

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

    public static TossFactory factory = new TossFactory() {
        public Toss getToss() {
            return new CoinToss();
        }
    };
}

class CubeToss implements Toss {
    Random r = new Random();

    public int toss() {
        return r.nextInt(6) + 1;
    }

    public static TossFactory factory = new TossFactory() {
        @Override
        public Toss getToss() {
            return new CubeToss();
        }
    };
}

public class Main {
    public static void getToss(TossFactory tossFactory) {
        Toss t = tossFactory.getToss();
        System.out.println(t.toss());
    }
    public static void main(String[] args) {
        System.out.println("Бросаем монету");
        getToss(CoinToss.factory);
        System.out.println("Бросаем Кубик");
        getToss(CubeToss.factory);
    }
}