package com.Patterns.State;

/**
 * Паттерн Состояние. Используется в тех случаях, когда во время выполнения программы объект должен менять своё
 * поведение в зависимости от своего состояния.
 */

interface Actor{ //Пьеса
    void act();
}
class HappyActor implements Actor { //Счастливая пьеса
    public void act() {
        System.out.println("HappyActor");
    }
}
class SadActor implements Actor { //Грустная пьеса
    public void act() {
        System.out.println("SadActor");
    }
}
class Stage {
    private Actor actor = new HappyActor();
    public void change() { // Изменяем пьесу
        actor = new SadActor();
    }
    public void change(Actor actorType) { //Указываем в парамере тип пьесы
        actor = actorType;
    }
    public void performPlay() { // Исполнить пьесу
        actor.act();
    }
}

public class Transmogrify {
    public static void main(String[] args) {
        Stage s = new Stage();
        s.performPlay();
        s.change();
        s.performPlay();
        s.change(new HappyActor());
        s.performPlay();
    }
}
