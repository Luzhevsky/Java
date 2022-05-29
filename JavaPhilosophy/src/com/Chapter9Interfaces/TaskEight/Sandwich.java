package com.Chapter9Interfaces.TaskEight;

interface FastFood {
    void cook();
}

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
class Lettuce implements FastFood{
    Lettuce() {
        System.out.println("Lettuce()");
    }
    @Override
    public void cook(){
        System.out.println("Cook Lettuce");
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
class Lunch extends Meal implements FastFood {
    Lunch() {
        System.out.println("Lunch()");
    }
    @Override
    public void cook(){
        System.out.println("Cook Lunch");
    }
}

/** Переносной Обед
 *
 */
class PortableLunch extends Lunch{
    PortableLunch() {
        System.out.println("PortableLunch");
    }
    @Override
    public void cook(){
        System.out.println("Cook Portable Lunch");
    }

}


public class Sandwich extends PortableLunch{
    public Sandwich() {
        new Bread();
        new Cheese();
        new Lettuce();
        new Pickle();
        System.out.println("Sandwich()");
    }
    @Override
    public void cook() {
        System.out.println("Cook Sandwich()");
    }

    public static void main(String[] args) {
        Lunch l = new Lunch();
        l.cook();
        System.out.println();
        Lettuce let = new Lettuce();
        let.cook();
        System.out.println();
        PortableLunch portableLunch = new PortableLunch();
        portableLunch.cook();

        System.out.println();
        FastFood s = new Sandwich();
        s.cook();

    }
}
