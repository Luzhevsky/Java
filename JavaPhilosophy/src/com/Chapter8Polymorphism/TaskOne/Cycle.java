package com.Chapter8Polymorphism.TaskOne;

public class Cycle {
    public void ride(){
        System.out.println("Cycle.ride");
    }
    public int wheels() {
        return 2;
    }
}


class Unicycle extends Cycle{
    @Override
    public void ride(){
        System.out.println("Unicycle.ride()");
    }
    public int wheels() {
        return 1;
    }
}

class Bicycle extends Cycle{
    @Override
    public void ride(){
        System.out.println("Bicycle.ride()");
    }
    public int wheels() {
        return 2;
    }
}

class Tricycle extends Cycle{
    @Override
    public void ride(){
        System.out.println("Tricycle.ride()");
    }
    public int wheels() {
        return 3;
    }

}


class Main2{
    public static void rideCycle(Cycle n){
        n.ride();
        System.out.println("Количество колес " + n.getClass().getSimpleName() + " " + n.wheels());
    }
    public static void Wheels(Cycle n){

    }

    public static void main(String[] args) {
        rideCycle(new Bicycle());
        rideCycle(new Tricycle());
        rideCycle(new Unicycle());
        rideCycle(new Cycle());

    }
}