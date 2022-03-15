package com.Chapter3.Operators.Fibonacci;

public class FibonacciMain {
        public static void Fibonacci(int f){
            //1 1 2 3 5 8 13 21
            int f0 = 1;
            int f1 = 1;
            int f2 = 0;
            int f3 = 0;
            for (int i = 0; i < f; i++) {
                f2 = f2 + f3;//f2=1 f3=1    2)f2=3 f3=1
                f3 = f3 + f2;

//                f2 = f2 + f1 + f0;// 1 2 3 4 5
                System.out.println(f1);
//                f1 = f1 + f0;
            }
        }
    public static void main(String[] args) {
        Fibonacci(24);
    }
}
