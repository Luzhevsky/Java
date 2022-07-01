package com.Chapter10InnerClasses.TaskTwenty;

interface Selector {//переключатель
    boolean end();
    Object current();
    void next();
}

public class Sequence { //последовательность
    private Object[] items;
    private int next = 0;
    public Sequence(int size) {
        items = new Object[size];
    }
    public Sequence() {}
    public void add(Object x) {
        if(next < items.length) {
            items[next++] = x;
        }
    }
    public Selector reverseSelector() {
        return new Selector() {
            private int i = items.length - 1;

            public boolean end(){
                return i == -1;
            }
            public Object current(){
                return items[i];
            }
            public void next(){
                if(i >= 0){
                    i--;
                }
            }
        };
    }

    private class SequenceSelector implements Selector {
        private int i = 0;
        @Override
        public boolean end() {
            return i == items.length;
        }
        @Override
        public Object current() {
            return items[i];
        }
        @Override
        public void next(){
            if( i < items.length){
                i++;
            }
        }

        public Sequence returnSequence() {
            return Sequence.this;
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++) {
            sequence.add(Integer.toString(i));
        }
        Selector selector = sequence.selector();

        SequenceSelector sequenceSelector = sequence.new SequenceSelector();
        System.out.println(sequenceSelector.returnSequence().getClass());



        //test
        Sequence s3 = new Sequence();
        SequenceSelector sequenceSelector3 = s3.new SequenceSelector();
        System.out.println(sequenceSelector3.returnSequence().toString());



        while(!selector.end()){
            System.out.print(selector.current() + " ");
            selector.next();
        }


        //TaskTwenty
        System.out.println();
        Selector reversSelector = sequence.reverseSelector();
        while (!reversSelector.end()){
            System.out.print(reversSelector.current() + " ");
            reversSelector.next();
        }
    }
}
