package com.Chapter10InnerClasses.Test.GreenhouseController;

abstract class Event {
    private long eventTime;
    protected final long delayTime;
    public Event(long delayTime){
        this.delayTime = delayTime;
        start();
    }

    public void start(){
        eventTime = System.nanoTime() + delayTime;
    }
}
