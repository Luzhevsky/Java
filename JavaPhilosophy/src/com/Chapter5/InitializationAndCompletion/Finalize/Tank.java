package com.Chapter5.InitializationAndCompletion.Finalize;

import java.sql.SQLOutput;

public class Tank {
    int tank;
    boolean tankEmpty = false;
    Tank(boolean tankEmpty){
        this.tankEmpty =  tankEmpty;
    }
    void checkIn(){
        tankEmpty = false;
    }
    public void finalize(){
        if(tankEmpty){
            System.out.println("Ошибка: finalize Танк не пустой нельзя заливать");
        }
    }

}
