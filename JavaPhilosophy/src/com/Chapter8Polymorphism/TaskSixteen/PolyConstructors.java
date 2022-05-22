package com.Chapter8Polymorphism.TaskSixteen;

class Glyph {
    void draw() {
        System.out.println("Glyph.draw()");
    }
    Glyph () {
        System.out.println("Glyph() перед вызовом draw()");
        draw();
        System.out.println("Glyph() после вызовом draw()");
    }

}

class RoundGlyph extends  Glyph {
    private int radius = 1;
    RoundGlyph(int r){
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }
    void draw(){
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
}

class RectangularGlyph extends Glyph{
    private int square = 1;
    RectangularGlyph(int S){
        square = S;
        System.out.println("RectangularGlyph.RectangularGlyph(), square = " + square);
    }
    void draw(){
        System.out.println("RectangularGlyph.draw(), square = " + square);
    }


}

public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
        System.out.println("--------------");
        new RoundGlyph(3);
    }
}
