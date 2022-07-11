package com.Chapter11Collections.TaskFour;

import java.util.*;

public class GeneratorFilmsHeroes {
    private final String[] nameHeroes = {"Джейк", "Ван Хельсинг", "Эрагон", "Артур", "Зорро", "Супер Мен", "Гарри поттер", "Арагорн"};

    private static int idNext = 0;

    public String next() {
        int count = idNext++;
        if(count == nameHeroes.length - 1) idNext = 0;
        return nameHeroes[count];
    }
    public Collection printCollections(Collection collection) {
        for (int i = 0; i < 8; i++) {
            collection.add(next());
        }
        return collection;
    }

}
class Main {

    public static void main(String[] args) {
        GeneratorFilmsHeroes gf = new GeneratorFilmsHeroes();
        System.out.println(gf.printCollections(new ArrayList()));
        System.out.println(gf.printCollections(new LinkedList()));
        System.out.println(gf.printCollections(new HashSet()));
        System.out.println(gf.printCollections(new LinkedHashSet()));
        System.out.println(gf.printCollections(new TreeSet()));
    }
}
