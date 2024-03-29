package com.Chapter11Collections.Test;

import java.util.ArrayList;

class Apple {
    private static int counter;
    private final int id = counter++;
    public long id() {
        return id;
    }
}

class Orange {

}

public class ApplesAndOrangesWithoutGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList apples = new ArrayList();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
        apples.add(new Orange());
        for (int i = 0; i < apples.size(); i++) {
            ((Apple)apples.get(i)).id();
        }
    }
}
