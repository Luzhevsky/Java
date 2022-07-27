package com.Chapter11Collections.Test;

import com.Testing.typeinfo.pets.*;

import java.util.LinkedList;

public class LinkedListFeatures {
    public static void main(String[] args) {
        LinkedList<Pet> pets = new LinkedList<Pet>(Pets.arrayList(5));
        System.out.println(pets);
        //Идентично При пустом списке исключение
        System.out.println("pets.getFirst(): " + pets.getFirst());
        System.out.println("pets.elements(): " + pets.element());
        //Отличается только поведением для пустого списка:(при пустом списке выдаст null).
        System.out.println("pets.peek(): " + pets.peek());
        //Идентично; удаление и возвращение первого элемента;
        System.out.println("pets.remove(): " + pets.remove());//при пустом списке исключение NoSuchElementException
        System.out.println("pets.removeFirst(): " + pets.removeFirst());//при пустом списке исключение NoSuchElementException
        //Отличается только поведение для пустого списка;
        System.out.println("pets.poll(): " + pets.poll());//в пустом списке вернет null
        System.out.println(pets);
        pets.addFirst(new Rat());
        System.out.println("После addFirst(): " + pets);
        pets.offer(Pets.randomPet());
        System.out.println("После offerPet(): " + pets);//тоже что add() и addLast()
        pets.add(Pets.randomPet());
        System.out.println("После add(): " + pets);
        pets.addLast(new Hamster());
        System.out.println("После addLast(): " + pets);
        System.out.println("pets.removeLast(): " + pets.removeLast());
        System.out.println(pets);




    }
}
