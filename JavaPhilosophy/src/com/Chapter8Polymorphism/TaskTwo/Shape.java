package com.Chapter8Polymorphism.TaskTwo;

import java.util.Random;

public class Shape {
    public void draw() {}
    public void erase() {}
    public void s(){
        System.out.println("Работает класс Shape");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }
    @Override
    public void erase() {
        System.out.println("Circle.erase()");
    }
    @Override
    public void s(){
        System.out.println("Работает класс Circle");
    }
}

class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }
    @Override
    public void erase() {
        System.out.println("Square.erase()");
    }
    @Override
    public void s(){
        System.out.println("Работает класс Square");
    }
}

class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Triangle.draw()");
    }
    @Override
    public void erase() {
        System.out.println("Triangle.erase()");
    }
    @Override
    public void s(){
        System.out.println("Работает класс Triangle");
    }
}

class Parallelogram extends Shape {
    @Override
    public void draw() {
        System.out.println("Parallelogram.draw()");
    }
    @Override
    public void erase() {
        System.out.println("Parallelogram.erase()");
    }
    @Override
    public void s(){
        System.out.println("Работает класс Parallelogram");
    }
}

class RandomShapeGenerator {
    private Random rand = new Random(4);
    public Shape next() {
        switch(rand.nextInt(4)){
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
            case 3: return new Parallelogram();

        }
    }
}

class Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        for (int i = 0; i < s.length; i++) {
            s[i] = gen.next();
        }
        for (Shape shp : s){
            shp.draw();
            shp.s();
        }
    }
}