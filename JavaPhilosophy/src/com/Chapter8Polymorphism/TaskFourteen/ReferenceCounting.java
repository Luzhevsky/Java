package com.Chapter8Polymorphism.TaskFourteen;

/** Общий класс Shared
 *
 */
class Shared {
    /** Количество ссылок
     *
     */
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;
    public Shared() {
        System.out.println("Созаем " + this);
    }
    public void addRef() {
        refcount++;
    }
    protected void dispose() {
        if(--refcount == 0){
            System.out.println("Уничтожаем " + this);
        }
    }
    public String toString() {
        return "Shared " + id;
    }

}

/**Составляющий класс
 *
 */
class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;
    public Composing(Shared shared){
        System.out.println("Создаем " + this);
        this.shared = shared;
        this.shared.addRef();
    }

    protected void dispose(){
        System.out.println("disposing " + this);
        shared.dispose();
    }

    public String toString(){
        return "Composing " + id;
    }

}

/** Класс подсчет ссылок ReferenceCounting
 *
 */
public class ReferenceCounting {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composings = {
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
                new Composing(shared)
        };
        for(Composing c: composings){
            c.dispose();
        }
    }
}
