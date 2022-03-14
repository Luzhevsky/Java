package com.Chapter4.ControlStructures;

public class Main {
    public static void main(String[] args) {
        System.out.println("helloControlStructures");
        System.out.println("helloworld");
        //Задание 1.
        for (int i = 1; i < 100; i++) {
//            System.out.println(i);
        }

        //Задание 2
        int a = (int)(Math.random() * 25);
        System.out.println("a = " + a);
        for (int i = 0; i < 25; i++) {
            int b = (int)(Math.random() * 25);

            if (a > b)
                System.out.println("Больше");
            else if (a < b)
                System.out.println("Меньше");
            else
                System.out.println("Равно");

        }

        //Задание 3
//        while(true){
//            int b = (int)(Math.random() * 25);
//            if (a > b)
//                System.out.println("Больше");
//            else if (a < b)
//                System.out.println("Меньше");
//            else
//                System.out.println("Равно");
//        }

        //Задание 4  1 2 3 5 7
        for (int i = 1; i < 25; i++) {
            int p = 0;
            for (int j = 2; j < 25; j++) {
                if((i % j == 0) && (i != j))
                    p++;
//                System.out.println(i + "%" + j + " = " + (i % j));
            }
            if(p == 0)
                System.out.println(i);
        }
    }
}
