package com.Chapter11Collections.TaskFourteen;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

public class InsertInMiddle {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ListIterator <Integer> iterator = ll.listIterator();
        for (int i = 0; i < 10; i++) {
            iterator.add(i + 1);
            if(i % 2 == 0){
                iterator.previous();
            }
            System.out.println(ll);
        }
        System.out.println(ll);
    }
}
