package com.Chapter9Interfaces.TaskThree;

import com.Chapter8Polymorphism.TaskTen.A;

public abstract class Documentation {//документация
    Documentation(){
        print();
    }
    abstract void print();
}

class Accounts extends Documentation {//счета
    int i = 1;
    @Override
    public void print(){
        System.out.println("Documentation.print() " + i);
    }
}

class ProjectDocumentation extends Documentation {//Проектная документация
    int i = 2;
    @Override
    public void print(){
        System.out.println("ProjectDocumentation.print() " + i);
    }
}

class RepairDocumentation extends Documentation {
    int i = 3;
    @Override
    public void print(){
        System.out.println("RepairDocumentation.print() " + i);
    }
}
class Main{
    public static void main(String[] args) {
        Accounts a = new Accounts();
        a.print();
//        Documentation b = new Accounts();

    }
}

