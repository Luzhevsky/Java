package com.Chapter3.Operators.Fibonacci;

public class FibonacciMain {
        public static void Fibonacci(int f){
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
    public static void main(String[] args) {
        Fibonacci(11);
    }
}
