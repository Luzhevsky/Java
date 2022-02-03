package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;
        int a;
        int b = 0;
        int N = Integer.parseInt(reader.readLine());
        while (N > 0) {
            a = Integer.parseInt(reader.readLine());
            if(a < 0 && b>=0) b = a;
            if (a < b) {
                maximum = b;
            } else {
                maximum = a;
            }
            b = maximum;
            N--;
        }

        //System.out.println("maximium =" + maximum);

        //напишите тут ваш код

        System.out.println(maximum);
    }
}
