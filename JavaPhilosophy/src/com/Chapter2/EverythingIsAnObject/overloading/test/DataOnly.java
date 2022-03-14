package com.Chapter2.EverythingIsAnObject.overloading.test;

public class DataOnly {
    private int age;
    private String name;

    static int test = 0;
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
