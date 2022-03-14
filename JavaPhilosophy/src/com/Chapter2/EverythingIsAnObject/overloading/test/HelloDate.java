//: object/HelloDate.java
package com.Chapter2.EverythingIsAnObject.overloading.test;

import java.util.*;

/** Первая программа-пример книги.
 * Выводит строку и текущее число.
 * @author Дмитрий Лужевский
 * @author dmitriy8796@inbox.ru
 * @version 1.0
 */
public class HelloDate {
    /** Точка входа в класс и приложение
     * @param args Массив строковых аргументов
     */
    public static void main(String[] args) {
        System.out.println("Привет, сегодня: ");
        System.out.println(new Date());
        FildsIntChar filds = new FildsIntChar();
        System.out.println(filds.c);
        System.out.println(filds.i);
        boolean s = true;
        ATypeName.type(s);
        DataOnly data = new DataOnly();
        data.setAge(25);
        data.setName("Дмитрий");
        System.out.println(data.getAge() + " " + data.getName());
        int storageName = storage(data.getName());
        System.out.println(storageName);
        Incrementable sf = new Incrementable();
        Incrementable sf1 = new Incrementable();
        Incrementable sf2 = new Incrementable();
        Incrementable sf3 = new Incrementable();
        sf.increment();
        sf1.increment();
        sf2.increment();
        sf3.increment();
        System.out.println("increment = " + DataOnly.test);

        for (String a: args) {
            System.out.println(a);
        }
        int a = 25;
        String s111 = "123";
        String s1 = new String("sdf");
        System.out.println(s1);

        AllTheColorsOfTheRainbow color = new AllTheColorsOfTheRainbow();
        color.setAnIntegerRepresentingColors(25);
        color.changeTheHueOfTheColor(8);
        System.out.println(color.getAnIntegerRepresentingColors());

    }

    public static int storage(String s) {
        return s.length() * 2;
    }
} /* Output: (55% match)
Привет, сегодня:
Sat Feb 12 04:30:07 MSK 2022
*///:~
