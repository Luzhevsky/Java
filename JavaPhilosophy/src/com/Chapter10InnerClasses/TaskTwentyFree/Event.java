package com.Chapter10InnerClasses.TaskTwentyFree;

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