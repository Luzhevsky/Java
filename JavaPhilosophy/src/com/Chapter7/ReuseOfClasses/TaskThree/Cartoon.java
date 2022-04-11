package com.Chapter7.ReuseOfClasses.TaskThree;

class Art {
    Art() {
        System.out.println("Конструктор Art");
    }


}

class Drawing extends Art{
    Drawing() {
        System.out.println("Конструктор Drawing");
    }
}

public class Cartoon extends Drawing {
    Cartoon() {
        System.out.println("Конструктор Cartoon");
    }
    public static void main(String[] args) {
        //Задание 3
        Cartoon c = new Cartoon();
        System.out.println(" ");
        Drawing d = new Drawing();
        //Задание 4. Если создать конструктор с параметром, то мы получим ошибку no arguments в наследники.
        // Мы так же знаем, что при создание конструктора с параметром, конструктор по умолчанию не создается,
        // мы должны создать его сами, следовательно конструктор в подклассе всегода вызывается.
    }
}
