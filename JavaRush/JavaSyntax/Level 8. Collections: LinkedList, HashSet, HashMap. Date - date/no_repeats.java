package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> people = new HashMap<String, String>();
        people.put("Кирилов","Максим");
        people.put("Иванов","Валерий");
        people.put("Сидоров","Владислав");
        people.put("Киров","Максим");
        people.put("Петров","Иван");
        people.put("Яковлев","Максим");
        people.put("Максаков","Дмитрий");
        people.put("Сергеев","Анатолий");
        people.put("Ильин","Сергей");
        people.put("Марков","Иван");

        return people;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map <String, String> dubl = new HashMap<String, String>(map);
        for(Map.Entry<String, String> d : dubl.entrySet()){
            int count = 0;
            String s = d.getValue().toString();
                for(Map.Entry<String, String> dd : dubl.entrySet()){
                    if (dd.getValue().equals(s)){
                        count++;
                    }
                }
                if(count > 1){
                    removeItemFromMapByValue(map, s);
                }
            }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Map <String, String> m = createMap();
        removeTheFirstNameDuplicates(m);
        System.out.println(m);
    }
}
