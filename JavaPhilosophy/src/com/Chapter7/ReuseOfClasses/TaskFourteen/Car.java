package com.Chapter7.ReuseOfClasses.TaskFourteen;

class Engine { //Двигатель
    public void start() {
        System.out.println("Запустить машину");
    }
    public void rev() {
        System.out.println("Переключить");
    }
    public void stop() {
        System.out.println("Остановить");
    }
    public void service() {
        System.out.println("Сервис");
    }
}

class Wheel { //Колесо
    public void inflate(int psi){
        System.out.println("Накачать колесо");
    }
}

class Window { //Окно
    public void rollup() {
        System.out.println("Поднять");
    }
    public void rollDown() {
        System.out.println("Опустить");
    }
}

class Door { //Дверь
    Window window = new Window();
    public void open() {
        System.out.println("Открыть дверь");
    }
    public void close() {
        System.out.println("Закрыть дверь");
    }
}
public class Car {
    public Engine e = new Engine();
    public Wheel[] wheel = new Wheel[4];
    public Door
            leftDoor = new Door(),
            rightDoor = new Door();
    public Car(){
        for (int i = 0; i < 4; i++) {
            wheel[i] = new Wheel();
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.leftDoor.window.rollup();
        car.wheel[0].inflate(72);
        car.e.service();

    }

}
