package com.Chapter4.ControlStructures;

public class Main {

    final static String BIN1 ="0110000";
    final static String BIN2 ="0000110";
    final static int B1=0x3;
    final static int B2=0x4;

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

        //Задание 4
        for (int i = 1; i < 10; i++) {
            int p = 0;
            for (int j = 2; j < 10; j++) {
                if((i % j == 0) && (i != j))
                    p++;
//                System.out.println(i + "%" + j + " = " + (i % j));
            }
            if(p == 0)
                System.out.println(i);
        }
        //Задание 5.

        System.out.println();
//        System.out.println(BIN1);
//        System.out.println(BIN2);
        System.out.println(Integer.toBinaryString(B1));
        System.out.println(Integer.toBinaryString(B2));
        System.out.println(B1);
        System.out.println(B2);
        String bs = "";
        int bb13 = 256;
        for (int i = 0; i < Integer.SIZE; i++) {
            int bb14 = bb13%2 == 0 ? 0 : 1;
            bs = String.valueOf(bb14) + bs;
            bb13 /= 2;
        }
        System.out.println("bs=" + bs);


    }
}
