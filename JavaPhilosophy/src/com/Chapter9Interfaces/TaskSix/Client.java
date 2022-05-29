package com.Chapter9Interfaces.TaskSix;

import com.Chapter9Interfaces.TaskFive.Interface.*;

public class Client implements Person{
    @Override
    public void reviews() {
        System.out.println("Client.reviews()");
    }
    
    @Override
    public void buy() {
        System.out.println("Client.buy()");
    }

    @Override
    public void visit() {
        System.out.println("Client.visit()");
    }
}


class Main{
    public static void main(String[] args) {
        Person p = new Client();
        p.visit();
        p.buy();
        p.reviews();
        //Если бы они были не public, мы бы не смогли получить к ним доступ.
        //При попытке изменить модификатор мы получим ошибку.
    }
}
