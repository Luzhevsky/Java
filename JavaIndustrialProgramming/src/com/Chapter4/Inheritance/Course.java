package com.Chapter4.Inheritance;

public class Course {
    public int id = 71;

    public Course() {
        System.out.println("конструткот класса Course");
        id = getId();
        System.out.println(" id = " + id);
    }

    public int getId() {
        System.out.println("getId() класса Course");
        return id;
    }
}

class BaseCourse extends Course {
    public int id = 90;

    public BaseCourse() {
        System.out.println("констуктор класса BaseCourse");
        System.out.println(" id=" + getId());
    }
    public int getId() {
        System.out.println("getId() класса BaseCourse");
        return id;
    }
}
class Logic {
    public static void main(String[] args) {
        Course objA = new BaseCourse();
        BaseCourse objB = new BaseCourse();
    }
}
