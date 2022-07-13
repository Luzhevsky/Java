package com.Chapter11Collections.TaskNine;

//interface Selector {
//    boolean end();
//    Object current();
//    void next();
//}

import java.util.ArrayList;
import java.util.Iterator;

public class Sequence {
    private ArrayList<Object> objAL = new ArrayList<>();
    public void add(Object x) {
        objAL.add(x);
    }

    public static void display(Sequence sequence) {
        Iterator<Object> it = sequence.getIterator();
        while(it.hasNext()){
            Object object = it.next();
            System.out.print(object);
        }
    }

    public Iterator getIterator() {
        return objAL.iterator();
    }


    public static void main(String[] args) {
        Sequence sequence = new Sequence();
        for (int i = 0; i < 10; i++) {
            sequence.add(Integer.toString(i));
        }
        display(sequence);
    }
}
