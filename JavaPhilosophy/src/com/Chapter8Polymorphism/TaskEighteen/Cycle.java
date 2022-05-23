package com.Chapter8Polymorphism.TaskEighteen;

public class Cycle {
    public void ride(){
        System.out.println("Cycle.ride");
    }
    public int wheels() {
        return 2;
    }
    public void balance(){
        System.out.println("fromCycle");
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

    public void balance(){
        System.out.println("Unicycle.balance()");
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

    public void balance(){
        System.out.println("Bicecle.balance()");
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


class Main{


    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        Unicycle unicycle = new Unicycle();
        Tricycle tricycle = new Tricycle();

        Cycle[] c = {
                new Bicycle(),
                new Unicycle(),
                new Tricycle()
        };
        c[0].balance();
        c[1].balance();
        c[2].balance();
        System.out.println();

        ((Bicycle)c[0]).balance();
        ((Unicycle)c[1]).balance();
       ((Tricycle)c[2]).balance();





    }
}