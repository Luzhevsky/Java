package com.Chapter11Collections.TaskSix;

import com.Testing.typeinfo.pets.*;

import java.util.*;

public class ListFeatures { //Особенности списка
    public static void main(String[] args) {
        Random rand = new Random(47);
        List<Pet> pets2 = Pets.arrayList(7);

        List<String> str = new ArrayList<String>();
        for (int i = 0; i < pets2.size(); i++) {
            str.add(pets2.get(i).toString());
        }
        System.out.println(str);
        List<String> pets = str;

        System.out.println("1: " + pets);
        Hamster h = new Hamster();
        pets.add(h.toString());
        System.out.println("2: " + pets);
        System.out.println("3: " + pets.contains(h));
        String p = pets.get(2);
        System.out.println("4: " + p + " " + pets.indexOf(p));
        Pet cympric = new Cymric();
        System.out.println("5: " +  pets.indexOf(cympric));
        System.out.println("6: " +  pets.remove(cympric));
        //Удаление заданного объекта
        System.out.println("7: " + pets.remove(p));
        System.out.println("8: " + pets);
        pets.add(3, new Mouse().toString());
        System.out.println("9: " + pets);
        List<String> sub = pets.subList(1, 4);
        System.out.println("Частичный список " + sub);
        System.out.println("10: " + pets.containsAll(sub));
        Collections.sort(sub);
        System.out.println("После сортировки: " + sub);
        //Для containsAll() порядок не важен
        System.out.println("11: " + pets.containsAll(sub));
        Collections.shuffle(sub, rand);//Перемешивание
        System.out.println("После перемешивания: " + sub);
        System.out.println("12: " + pets.containsAll(sub));
        List<String> copy = new ArrayList<String>(pets);
        System.out.println("copy = " + copy);
        sub = Arrays.asList(pets.get(1), pets.get(4));
        System.out.println("sub: " + sub);
        copy.retainAll(sub);
        System.out.println("13: " + copy);
        copy = new ArrayList<String>(pets); //Копирование
        copy.remove(2);//Удаление по индексу
        System.out.println("14: " + copy);
        copy.removeAll(sub);//Удаление заданных объектов
        System.out.println("15: " + copy);
        copy.set(1, new Mouse().toString());//Замена элемента
        System.out.println("16: " + copy);
        copy.addAll(2, sub);
        System.out.println("17: " + copy);
        System.out.println("18: " + pets.isEmpty());
        pets.clear(); //Удаление всех элементов
        System.out.println("19: " + pets);
        System.out.println("20: " + pets.isEmpty());
        pets.addAll(sub);
        System.out.println("21: " + pets);
        Object[] o = pets.toArray();
        System.out.println("22: " + o[1]);
        String[] pa = pets.toArray(new String[0]);
        System.out.println("23: " + pa[1]);

    }
}
