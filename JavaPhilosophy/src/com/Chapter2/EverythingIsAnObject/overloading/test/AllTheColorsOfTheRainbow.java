package com.Chapter2.EverythingIsAnObject.overloading.test;

public class AllTheColorsOfTheRainbow {
    int anIntegerRepresentingColors;// цело число представляющее цвет

    public int getAnIntegerRepresentingColors() {
        return anIntegerRepresentingColors;
    }

    public void setAnIntegerRepresentingColors(int anIntegerRepresentingColors) {
        this.anIntegerRepresentingColors = anIntegerRepresentingColors;
    }

    void changeTheHueOfTheColor(int newHue){ //изменение оттенка цвета, параметро новый оттенок
        System.out.println("Оттенок изменнен на " + newHue + " = "+  (this.anIntegerRepresentingColors + newHue));
    }
}
