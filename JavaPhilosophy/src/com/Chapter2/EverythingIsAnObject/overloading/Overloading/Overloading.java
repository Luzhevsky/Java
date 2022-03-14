/** Программа пример перегрузки методов и конструктора
 * Программа демонстрирует перегрузку методов и конструторов.
 * @author Лужевский Дмитрий
 * @author dmitriy8796@inbox.ru
 * @version 1.0
 *
 */
package com.Chapter2.EverythingIsAnObject.overloading.Overloading;

/** Класс содержащий метод Main
 *
 */
public class Overloading {
    /**
     * Точка входа в класс и приложение
     * @param args Массив строковых аргументов. Можно считать при передачи данных
     *             через консоль при выполнении программы.
     * Цикл меняет числовой аргумент конструктора Tree на значения от 0 до 5.
     * И приводит пример перегруженного конструктора и метода. Метод info() выводит информацию о дереве см. Далее.
     * @see Tree
     */
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("Перегруженный метод");
        }
        // Перегруженный конструктор:
        new Tree();
    }
}
