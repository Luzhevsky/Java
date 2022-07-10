package com.Chapter11Collections.TaskFree;


import java.util.ArrayList;

class A {
    String s = "hello";
    public String toString() {
        return s;
    }
}



interface Selector {
    boolean end();
    Object current();
    void next();
}

public class Sequence {
    private ArrayList<Object> items = new ArrayList<>();
    private int next = 0;
    public void add(Object x) {
        items.add(x);
    }

    private class SequenceSelector implements Selector {
        private int i = 0;
        @Override
        public boolean end() {
            return i == items.size();
        }
        @Override
        public Object current() {
            return items.get(i);
        }
        @Override
        public void next(){
            if( i < items.size()){
                i++;
            }
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence();
        for (int i = 0; i < 10; i++) {
            sequence.add(Integer.toString(i));
        }

        for (int i = 0; i < 5; i++) {
            sequence.add(new A());
        }

        Selector selector = sequence.selector();

        while(!selector.end()){
            System.out.print(selector.current() + " ");
            selector.next();
        }


    }
}
