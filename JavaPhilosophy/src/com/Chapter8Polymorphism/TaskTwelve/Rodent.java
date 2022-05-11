package com.Chapter8Polymorphism.TaskTwelve;

import java.util.Random;

/** Класс характеристика - характеристика грызунов, добавляется как композиции в классы грызунов.
 * Для демонстрации завершения.
 *
 */
class Description {
    String s;
    Description(String s){
        this.s = s;
        System.out.println("Создаем описание " + s);
    }
    /** Завершение класса(Типа освобождение памяти).
     *
     */
    public void dispose(){
        System.out.println("Завершение описание " + s);
    }
}


/** Rodent - Грызуны
 *
 */
public class Rodent {

    private Description c = new Description("Грызуны́ — самый многочисленный отряд млекопитающих.");

    Rodent(){
        System.out.println("Rodent()");
    }
    /** Грызун что-то грызет.
     *
     */
    public void gnaw(){
        System.out.println("Грызун грызет. (Метод gnaw() Класса Rodent).");
    }

    /** Грызун бежит.
     *
     */
    public void run(){
        System.out.println("Грызун бежит. (Метод run() Класса Rodent).");
    }

    /** Завершение класса(Типа освобождение памяти).
     *
     */
    protected void dispose(){
        System.out.println("Завершаем Rodent");
        c.dispose();
    }
}

class Mouse extends Rodent {

    Description c = new Description("Мышь. Длина тела от 5 см до 48 см.");

    Mouse() {
        System.out.println("Mouse()");
    }

    @Override
    public void gnaw(){
        System.out.println("Мышь грызет. (Метод gnaw() Класса Mouse).");
    }
    @Override
    public void run(){
        System.out.println("Мышь бежит. (Метод run() Класса Mouse).");
    }

    /** Завершение класса(Типа освобождение памяти).
     *
     */
    protected void dispose(){
        System.out.println("Завершаем Mouse");
        c.dispose();
        super.dispose();
    }
}

class Hamster extends Rodent {

    Description c = new Description("Хомяк — подсемейство грызунов " +
            "семейства хомяковых. Включает 19 видов, относящихся к семи родам.");

    Hamster() {
        System.out.println("Hamster");
    }
    @Override
    public void gnaw(){
        System.out.println("Хомяк грызет. (Метод gnaw() Класса Hamster).");
    }
    @Override
    public void run(){
        System.out.println("Хомяк бежит. (Метод run() Класса Hamster).");
    }

    /** Завершение класса(Типа освобождение памяти).
     *
     */
    protected void dispose(){
        System.out.println("Завершаем Hamster");
        c.dispose();
        super.dispose();

    }
}

class Chinchilla extends Rodent {

    Description c = new Description("Шинши́ллы — род грызунов семейства шиншилловых. " +
            "Естественный ареал — пустынное высокогорье Анд в Чили, Перу, Боливии и Аргентине.");

    Chinchilla() {
        System.out.println("Chinchilla()");
    }
    @Override
    public void gnaw(){
        System.out.println("Шиншила грызет. (Метод gnaw() Класса Chinchilla).");
    }
    @Override
    public void run(){
        System.out.println("Шиншила бежит. (Метод run() Класса Chinchilla).");
    }

    /** Завершение класса(Типа освобождение памяти).
     *
     */
    protected void dispose(){
        System.out.println("Завершаем Chinchilla");
        c.dispose();
        super.dispose();

    }

}
/** Генерация создания объектов.
 *
 */
class GetRandomHeir {
    Random r = new Random();
    public Rodent getR(){
        switch (r.nextInt(3)){
            default :
            case 0: return new Mouse();
            case 1: return new Hamster();
            case 2: return new Chinchilla();

        }
    }
}

class Main {
    public static void main(String[] args) {
//        GetRandomHeir getrandom = new GetRandomHeir();

        Mouse m = new Mouse();
        m.dispose();
        /**
         * Вывод Сначало создается внешний класс(композиция), затем выполняется конструктор. И методы основного класса.
         */
//        Rodent[] rodent = new Rodent[3];
//        rodent[0] = new Mouse();
//        rodent[1] = new Hamster();
//        rodent[2] = new Chinchilla();
//
//        for(Rodent r : rodent){
//            r.run();
//            r.gnaw();
//            r.dispose();
//        }


    }
}
