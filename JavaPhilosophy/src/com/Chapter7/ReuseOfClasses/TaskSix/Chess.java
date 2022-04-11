package com.Chapter7.ReuseOfClasses.TaskSix;

class Game {
    Game(int i) {
        System.out.println("Конструктор Game");
    }
}

class BoardGame extends Game {
    BoardGame(int i){
        super(i);
        System.out.println("Конструктор BoardGame");
    }

}


public class Chess extends BoardGame {
    Chess() {
        super(11);
        System.out.println("Конструктор Chess");
    }

    public static void main(String[] args) {
        //Задание 6.
        Chess x = new Chess();
    }
}
