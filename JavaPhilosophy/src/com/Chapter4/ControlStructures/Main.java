package com.Chapter4.ControlStructures;

public class Main {

    final static String BIN1 ="0110000";
    final static String BIN2 ="0000110";
    final static int B1=0x3;
    final static int B2=0x4;

    static int test(int testval, int begin, int end){  //5 1 10
        if (testval>= begin && testval <= end)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        System.out.println("helloControlStructures");
        System.out.println("helloworld");
        //Задание 1.
        for(int i = 1; i < 100; i++) {
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

        //Задание 6. метод test см. вверх
        System.out.println(test(-5,1,10));
        //Задание 7.
        for(int i = 1; i <= 100; i++) {
//            System.out.println(i);
//            if(i==99)break;
        }
        //Задание 8.
        System.out.println("switch");
        for (int i = 1; i < 6; i++) {

            switch (i) {
                case 1:
                    System.out.println(1);

                case 2:
                    System.out.println(2);

                case 3:
                    System.out.println(3);

                case 4:
                    System.out.println(4);

                case 5:
                    System.out.println(5);

                default:
                    System.out.println("default");
            }
        }
    }
}
