package com.Chapter11Collections.TaskFive;

import com.Chapter11Collections.Test.typeinfo.pets.*;
import java.util.List;
import java.util.Random;

public class ListFeatures { //Особенности списка
    public static void main(String[] args) {
        Random rand = new Random(47);
        List<Pet> pets = Pets.arrayList(7);
        System.out.println("1: " + pets);
    }
}
