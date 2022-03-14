package com.Chapter3.Operators.OperationsWithBits;

public class Main {
    final static String BIN1 ="00110000";
    final static String BIN2 ="00000110";
    final static int B1=0x3;
    final static int B2=0x4;
    public static void main(String[] args) {
        System.out.println(Integer.parseInt(BIN1, 2));
        System.out.println(Integer.parseInt(BIN2));
        System.out.println(Integer.parseInt(BIN2));
        int a = Integer.parseInt(BIN1);
        int b = Integer.parseInt(BIN2);
        System.out.println("a | b = " + (a | b));
        System.out.println("a & b = " + (a & b));
        System.out.println("~a = " + (~a));
        System.out.println("~b = " + (~b));
        System.out.println("число шестнадцатеричное число");
        int hex = 0xf;

        System.out.println(hex);
        byte by = 0xf;
        short shor = 0xff;
        System.out.println(by);
        System.out.println(shor);
        System.out.println(Integer.toBinaryString(B1));
        System.out.println(Integer.toBinaryString(B2));
        System.out.println("Побитовое или");
        System.out.println(Integer.toBinaryString(B1 | B2));//111
        System.out.println("Побитовое и");
        System.out.println(Integer.toBinaryString(B1 & B2));//0
        System.out.println("Побитовое не ~B1");
        System.out.println(Integer.toBinaryString(~B1));//100
        System.out.println("Побитовое не ~B2");
        System.out.println(Integer.toBinaryString(~B2));//011
        System.out.println("Исключающее или XOR ^B1");
        System.out.println(Integer.toBinaryString(B1^B2));//011^100 = 111

    }
}
