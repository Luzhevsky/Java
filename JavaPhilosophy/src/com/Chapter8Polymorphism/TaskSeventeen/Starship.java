package com.Chapter8Polymorphism.TaskSeventeen;


public class Starship {
    public void act(){}
}

class StarFighters extends Starship {
    @Override
    public void act() {
        System.out.println("StarFighters fly");
    }
}

class StarBombers extends Starship {
    @Override
    public void act() {
        System.out.println("StarBombers fly");
    }
}

class StarScout extends Starship {
    @Override
    public void act() {
        System.out.println("StarScout fly");
    }

}

class AlertStatus{
    private Starship starship = new StarFighters();
    public void change() {
        starship = new StarBombers();
    }
    public void shipGo(){
        starship.act();
    }

    public void change(Starship s) {
        starship = s;
    }
}

class Main {
    public static void main(String[] args) {
        AlertStatus a = new AlertStatus();
        a.shipGo();
        a.change();
        a.shipGo();
        a.change(new StarScout());
        a.shipGo();
    }
}