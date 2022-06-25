package com.Chapter9Interfaces.TaskNineteen;

public interface Cycle {
    public void ride();
    public int wheels();
    public void balance();
}

interface CycleFactory { //фабрика велосипед
    Cycle getCycle();
}

class Unicycle implements Cycle{
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

class UnicycleFactory implements CycleFactory {
    public Cycle getCycle() {
        return new Unicycle();
    }
}

class Bicycle implements Cycle{
    @Override
    public void ride(){
        System.out.println("Bicycle.ride()");
    }
    public int wheels() {
        return 2;
    }
    public void balance(){
        System.out.println("Bicycle.balance()");
    }
}

class BicycleFactory implements CycleFactory {
    public Cycle getCycle() {
        return new Bicycle();
    }
}

class Tricycle implements Cycle{
    @Override
    public void ride(){
        System.out.println("Tricycle.ride()");
    }
    public int wheels() {
        return 3;
    }
    public void balance() {
        System.out.println("Tricycle.balance()");
    }

}

class TricycleFactory implements CycleFactory {
    public Cycle getCycle() {
        return new Tricycle();
    }
}


class Main{
    public static void goCycle(CycleFactory c) {
        c.getCycle().balance();
        c.getCycle().ride();
        System.out.println(c.getCycle().wheels());
    }

    public static void main(String[] args) {
        goCycle(new TricycleFactory());
        goCycle(new BicycleFactory());
        goCycle(new UnicycleFactory());


//        Bicycle bicycle = new Bicycle();
//        Unicycle unicycle = new Unicycle();
//        Tricycle tricycle = new Tricycle();
//
//        Cycle[] c = {
//                new Bicycle(),
//                new Unicycle(),
//                new Tricycle()
//        };
//        c[0].balance();
//        c[1].balance();
//        c[2].balance();
//        System.out.println();
//
//        ((Bicycle)c[0]).balance();
//        ((Unicycle)c[1]).balance();
//       ((Tricycle)c[2]).balance();

    }
}