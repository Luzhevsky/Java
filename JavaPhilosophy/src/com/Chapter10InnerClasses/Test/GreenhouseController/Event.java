package com.Chapter10InnerClasses.Test.GreenhouseController;

abstract class Event { //event - Событие
    private long eventTime;
    protected final long delayTime;
    public Event(long delayTime){ //delayTime - задержка времени
        this.delayTime = delayTime;
        start();
    }

    public void start(){
        eventTime = System.nanoTime() + delayTime;//nanoTime - время с произвольного якоря VM.
    }

    public boolean ready(){//готово
        return System.nanoTime() >= eventTime;
    }
    public abstract void action();
}

//class Main extends Event{
//    Main(long time) {
//        super(time);
//    }
//    public void action() {
//        System.out.println("Action()");
//    }
//
//    public static void main(String[] args) {
//        Main m = new Main(2000000000);
//        m.action();
//        m.start();
//        System.out.println(System.nanoTime());
//        while(!m.ready()){
//            System.out.println(System.nanoTime());
//        }
//        System.out.println(System.nanoTime());
//    }
//}