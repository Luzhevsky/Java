package com.Chapter2.EverythingIsAnObject.overloading.Overloading;
//:object/Overloading.java
/** Точкоа входа в класс Tree
 *  Класс Tree содержит одну переменную height, конструктор Tree, перегруженный конструктор Tree(int initialHeight)
 *  и два void метода info() и перегруженный метода info(String s).
 */
public class Tree {
    /** Переменная height типа int определяет высоту дерева */

    public int height;

    /**
     * Конструктор Tree() определяет начальную высоту дарава как 0, и выдает сообщение "сажаем росток."
     */
    public Tree() {
        System.out.println("Сажаем росток");
        height = 0;
    }
    /**
     * Перегруженный конструктор Tree(int initialHeight) параметр initialHeight задачет высоту дерева
     * конструктор выводит констолькое сообщение с переменной height.
     * @param initialHeight задачет высоту дерева.
     */
    public Tree(int initialHeight){
        height = initialHeight;
        System.out.println("Создание нового дерева высотой " + height + " м.");
    }
    /**
     * Метод void info() выводит на колнсоль переменную height.
     */
    public void info() {
        System.out.println("Дерево высотой " + height +  " м.");
    }
    /**
     * Перегруженный метод void info(String s) выводит на колнсоль переменную height. Добавляя к ней
     * описание, параметр s перед высотой.
     * @param s описание к дереву.
     */
    public void info(String s){
        System.out.println(s + ": Дерево высотой " + height + "м.");
    }

}
///:~
