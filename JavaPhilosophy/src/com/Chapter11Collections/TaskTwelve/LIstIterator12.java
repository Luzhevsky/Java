package com.Chapter11Collections.TaskTwelve;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class LIstIterator12 {
    public static void main(String[] args) {
        List<Integer> LI = Arrays.asList(0, 21, 22, 13, 34, 54, 16);
        List<Integer> LI2 = new ArrayList<>();
        ListIterator<Integer> it = LI.listIterator();
        while(it.hasNext()){
            it.next();
        }
        while(it.hasPrevious()) {
            LI2.add(it.previous());
        }
        System.out.println(LI);
        System.out.println(LI2);
    }

}
