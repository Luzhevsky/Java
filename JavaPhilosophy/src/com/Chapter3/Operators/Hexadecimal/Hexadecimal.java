package com.Chapter3.Operators.Hexadecimal;

public class Hexadecimal {
    public static void main(String[] args) {
        long l;
        l = 0x123;
        long v = 0123;
        System.out.println(Long.toBinaryString(l));
        System.out.println(Long.toBinaryString(v));
        System.out.println(Long.toHexString(v));
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
        final int CONST1 = 0x222;
        final int CONST2 = 0x111;
        System.out.println("Const 1 = " + CONST1);
        System.out.println("Const 2 = " + CONST2);
        System.out.println("COnst 1 & const2 = " + (CONST1&CONST2));
        System.out.println(CONST1|CONST2);
        System.out.println(CONST1&CONST2);
        System.out.println(~CONST2);
    }
}
