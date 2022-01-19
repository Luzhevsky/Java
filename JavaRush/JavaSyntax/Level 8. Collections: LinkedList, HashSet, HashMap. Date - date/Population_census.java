package com.javarush.task.task08.task0815;

import java.util.Map;
import java.util.HashMap;


public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> people = new HashMap<String, String>();
        people.put("Киролов","Максим");
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

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count = 0;
        for(Map.Entry<String, String> item : map.entrySet()){
            if(item.getValue().equals(name))
            count++;
        }
        return count;

    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count = 0;
        for(Map.Entry<String, String> item : map.entrySet()){
            if(item.getKey().equals(lastName))
            count++;
        }
        return count;

    }

    public static void main(String[] args) {
        Map<String, String> people = createMap();
        getCountTheSameFirstName(people, "Дмитрий");
        getCountTheSameLastName(people, "Иванов");

    }
}
