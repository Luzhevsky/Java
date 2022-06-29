package com.Chapter10InnerClasses.TaskThirteen;

public class OneClass {
    private String name;

    OneClass(String name) {
        this.name = name;
        System.out.println(name);
    }
}

class TwoClass {
    public OneClass getLink(String name) {
            return new OneClass(name){};
    }
}

class Main {
    public static void main(String[] args) {
        OneClass one = new TwoClass().getLink("hello");
    }
}