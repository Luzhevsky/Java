package com.Chapter7.ReuseOfClasses.TaskNineteen;

class Link {
    private int i;

    Link(int i){
        this.i = i;
        System.out.println(i);
    }
}

public class ClassVoidFinal {
    final Link l;

    ClassVoidFinal() {
        l = new Link(1);
    }
    ClassVoidFinal(int u){
        l = new Link(u);
    }

}

class m {
    public static void main(String[] args) {
        ClassVoidFinal c = new ClassVoidFinal();
        //c.l = new Link(3); Cannot assign a value to final variable 'l'
        


    }
}