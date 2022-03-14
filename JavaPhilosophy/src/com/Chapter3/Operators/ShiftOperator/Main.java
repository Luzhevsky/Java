package com.Chapter3.Operators.ShiftOperator;

public class Main {
    void f(boolean b){
        System.out.println(b);
    }
    public void metodString(String a, String b){
        //Операции сравнения и логические операции
        //!f(a > b);
        //!f(a >= b);
        //!f(a < b);
        //!f(a <= b);
        //!f(!a);
        //!f(a && b);
        //!f(a || b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.print("a == b = ");
        f(a == b);
        System.out.print("a != b = ");
        f(a != b);
        System.out.print("a.equals(b) = ");
        f(a.equals(b));
        System.out.print("!a.equals(b) = ");
        f(!a.equals(b));

    }
    public static void main(String[] args) {
        int a = 0x9;
        System.out.println(Integer.toBinaryString(a));
        a >>=4;
        System.out.println(Integer.toBinaryString(a));
        int b =20;
        b>>=2;
        System.out.println(b);
        int c = 0x100;
        System.out.println(c);
        for (; c > 0; c = c >> 1) {
            System.out.println(Integer.toBinaryString(c) + "   " +c);
        }


        int d = 0x8;
        System.out.println("d=" + Integer.toBinaryString(d) + "   " + d);
        d = d << 2;
        System.out.println("d=" + Integer.toBinaryString(d) + "   " + d);
        for (int i = 0; i < 4; i++) {
            d = d >>> 1;
            System.out.println(Integer.toBinaryString(d) + "    " + d);
        }
        char f = 41;
//        while (f < 50){
//            System.out.print(f + " ");
//            f++;
//        }
        System.out.println();
        System.out.println(f);
        char e = ')';
        String s = Integer.toBinaryString(e);
        System.out.println(s);
        System.out.println();
        int cod = (int) e;
        System.out.println("cod=" + cod);
        //14 String
        Main m = new Main();
        System.out.println("string 14");

        m.metodString("abc", "a");
        m.metodString("abc", "abc");
        String str = new String("abc");
        m.metodString("abc", str);
    }
}
