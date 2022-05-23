package com.Chapter8Polymorphism.Test;
//зерно
class Grain {
    public String toString(){
        return "Graing";
    }
}

class Wheat extends Grain { //пшеница
    public String toString() {
        return "Wheat";
    }
}

class Mill { //мельница
    Grain process() {
        return new Grain();
    }
}

class WheatMill extends Mill { //мельница зерна
    Wheat process() {
        return new Wheat();
    }
}

public class CovariantReturn {
    public static void main(String[] args) {
        Mill m = new Mill();
        Grain g = m.process();
        System.out.println(g);
        m = new WheatMill();
        g =m.process();
        System.out.println(g);
    }
}
