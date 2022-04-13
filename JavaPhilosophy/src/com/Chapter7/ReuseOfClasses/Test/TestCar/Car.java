package com.Chapter7.ReuseOfClasses.Test.TestCar;
//Композиция
public class Car {
    private String name;
    Car(String name) {
        this.name = name;
    }
    public void speed(int u){
        System.out.println(u + " Скорость машины");
    }
    public String toString(){
        return name;
    }
}
class Wheel {
    Car honda = new Car("Honda");
    private String name;
    Wheel(String name){
        this.name = name + " " + honda.toString();
    }
    public String toString(){
        return name;
    }

    public static void main(String[] args) {
        Wheel w = new Wheel("Колесо с шипами");
        System.out.println(w);
    }
}

class Camera{
    Wheel w = new Wheel("переднее колесо");
    private String name;

    Camera(String name){
        this.name = name + " " + w.toString();
    }
    public String toString(){
        return name;
    }

    public static void main(String[] args) {
        Camera c = new Camera("Уплотненная");
        System.out.println(c);
    }
}