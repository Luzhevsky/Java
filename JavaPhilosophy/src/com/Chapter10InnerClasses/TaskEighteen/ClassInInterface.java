package com.Chapter10InnerClasses.TaskEighteen;

public interface ClassInInterface {
    class Nested {
        void name() {
            System.out.println("Nested");
        }
    }
}

class Realization implements ClassInInterface {

    public static void main(String[] args) {
        Nested classInInterface = new ClassInInterface.Nested();
        classInInterface.name();
    }
}
