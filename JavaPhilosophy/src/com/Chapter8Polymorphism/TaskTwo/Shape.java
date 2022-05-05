package com.Chapter8Polymorphism.TaskTwo;

import java.util.Random;

public class Shape {
    public void draw() {}
    public void erase() {}
}

class Circle extends Shape {
    public void draw() {
        System.out.println("Circle.draw()");
    }
    public void erase() {
        System.out.println("Circle.erase()");
    }
}

class Square extends Shape {
    public void draw() {
        System.out.println("Square.draw()");
    }
    public void erase() {
        System.out.println("Square.erase()");
    }
}

class Triangle extends Shape {
    public void draw() {
        System.out.println("Triangle.draw()");
    }
    public void erase() {
        System.out.println("Triangle.erase()");
    }
}

class RandomShapeGenerator {
    private Random rand = new Random(47);
    public Shape next() {

    }
}