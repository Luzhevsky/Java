package com.Chapter9Interfaces.TaskThirteen;

//Можно наследовать два интерфейса
public interface InterfaceMain {
    void m();
}

interface SonMainOne extends InterfaceMain {
    void sonOne();
}

interface SonMainTwo extends InterfaceMain{
    void sonTwo();
}

interface Three extends SonMainTwo, SonMainOne {

}

class test implements SonMainTwo {
    //Должен реализовать и SonMainTwo и его родителя InterfaceMain
    @Override
    public void sonTwo() {

    }
    @Override
    public void m() {

    }
}