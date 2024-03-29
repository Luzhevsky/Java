package com.Chapter8Polymorphism.TaskEleven;

import com.Chapter7.ReuseOfClasses.TaskSix.Chess;

/** Еда
 *
 */
class Meal {
    Meal() {
        System.out.println("Meal()");
    }
}

/** Хлеб
 *
 */
class Bread {
    Bread() {
        System.out.println("Bread()");
    }
}

/** Сыр
 *
 */
class Cheese {
    Cheese() {
        System.out.println("Cheese()");
    }
}

/** Салат
 *
 */
class Lettuce {
    Lettuce() {
        System.out.println("Lettuce()");
    }
}

/** Соленый огурец
 *
 */
class Pickle {
    Pickle(){
        System.out.println("Pickle()");
    }
}

/** Обед(Ланч)
 *
 */
class Lunch extends Meal {
    Lunch() {
        System.out.println("Lunch()");
    }
}

/** Переносной Обед
 *
 */
class PortableLunch extends Lunch {
    PortableLunch() {
        System.out.println("PortableLunch");
    }
}


public class Sandwich extends PortableLunch{
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();
    private Pickle p = new Pickle();

    public Sandwich() {
        System.out.println("Sandwich()");
    }
    

    public static void main(String[] args) {
        new Sandwich();
    }
}
