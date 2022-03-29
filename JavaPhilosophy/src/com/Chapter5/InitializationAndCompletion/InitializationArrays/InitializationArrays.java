package com.Chapter5.InitializationAndCompletion.InitializationArrays;

public class InitializationArrays {
    public static void main(String[] args) {
        //Задание 16.
        String[] arrays = new String[]{"a", "b", "c", "d", "e"};
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }

        //Задание 17.
        ClassWithConstructorArrays[] ar;
        ar = new ClassWithConstructorArrays[3];
        //Задание 18
        ar[0] = new ClassWithConstructorArrays("Объект 0");
        ar[1] = new ClassWithConstructorArrays("Объект 1");
        ar[2] = new ClassWithConstructorArrays("Объект 2");
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }
}
