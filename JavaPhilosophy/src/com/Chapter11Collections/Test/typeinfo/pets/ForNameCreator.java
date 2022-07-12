package com.Chapter11Collections.Test.typeinfo.pets;

import java.util.ArrayList;
import java.util.List;

public class ForNameCreator  extends PetCreator {
    private static List<Class<? extends Pet>> types = new ArrayList<Class<? extends Pet>>();
    //Типы которые должны создаваться случайным образом:
    private static String[] typeNames = {
            "com.Chapter11Collections.Test.typeinfo.pets.Mutt",
            "com.Chapter11Collections.Test.typeinfo.pets.Pug",
            "com.Chapter11Collections.Test.typeinfo.pets.EgyptianMau",
            "com.Chapter11Collections.Test.typeinfo.pets.Manx",
            "com.Chapter11Collections.Test.typeinfo.pets.Cymric",
            "com.Chapter11Collections.Test.typeinfo.pets.Rat",
            "com.Chapter11Collections.Test.typeinfo.pets.Mouse",
            "com.Chapter11Collections.Test.typeinfo.pets.Hamster"
    };
    @SuppressWarnings("unchecked")
    private static void loader() {
        try {
            for(String name: typeNames)
                types.add((Class<? extends Pet>)Class.forName(name));

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    static { loader(); }
    public List<Class<? extends Pet>> types() {
        return types;
    }

}
