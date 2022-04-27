package com.Chapter8Polymorphism.TaskOne;

public class Cycle {
    public void ride(){
        System.out.println("Cycle.ride");
    }
}


class Unicycle extends Cycle{
    @Override
    public void ride(){
        System.out.println("Unicycle.ride()");
    }

}

class Bicycle extends Cycle{
    @Override
    public void ride(){
        System.out.println("Bicycle.ride()");
    }
}

class Tricycle extends Cycle{
    @Override
    public void ride(){
        System.out.println("Tricycle.ride()");
    }

}


class Main2{
    public static void rideCycle(Cycle n){
        n.ride();
    }

    public static void main(String[] args) {
        rideCycle(new Bicycle());
        rideCycle(new Tricycle());
        rideCycle(new Unicycle());
        rideCycle(new Cycle());

    }
}