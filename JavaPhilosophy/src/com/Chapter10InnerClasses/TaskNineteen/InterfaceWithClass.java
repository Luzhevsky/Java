package com.Chapter10InnerClasses.TaskNineteen;

import com.Chapter10InnerClasses.TaskSix.NewPackage.M;

public interface InterfaceWithClass {
    static void getName() {
        System.out.println("InterfaceWithClass");
    }
    class Nested {
        public static void method(InterfaceWithClass interfaceWithClass){
            getName();
            System.out.println(interfaceWithClass);
        }
    }
}

class Main implements InterfaceWithClass{

    public static void main(String[] args) {
        Main m = new Main();
        Nested.method(m);
    }

}
