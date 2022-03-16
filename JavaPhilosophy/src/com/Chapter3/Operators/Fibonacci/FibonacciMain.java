package com.Chapter3.Operators.Fibonacci;

public class FibonacciMain {
        public static void Fibonacci2(int f){
            //1 1 2 3 5 8 13 21
            int f0 = 1;
            int f1 = 0;
            for (int i = 0; i < f; i+=2) {
                f0 = f0 + f1;// итер 1:  f0=1+1=2; итер2: f0=2+3=5;
                System.out.print(f0 + " ");
                if(f%2!=0){
                   if(i == f-1)break;
                }
                f1 = f1 + f0;// иетр 1: f1=1+2=3; итер2: f1=3+5=8;
                System.out.print(f1 + " ");
            }

        }
        public static void Fibonacci(int f){
            int f0 = 0;
            int f1 = 1;
            int fib = 0;
            if (f > 1){
                System.out.println(f1);
            }
            for (int i = 1; i < f; i++) {
                fib = f0 + f1; // fib=1,f0=0,f1=1 2)fib=2,f0=1,f1=1 3)fib
                System.out.println(fib);
                f0 = f1; //1 1
                f1 = fib; //1 2
            }
        }
    public static void main(String[] args) {
        Fibonacci(21);
    }
}
