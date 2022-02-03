package com.javarush.task.task05.task0530;

import java.io.*;

/* 
Шеф, что-то не пашет
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String a = reader.readLine();
            String a1 = reader.readLine();
            int b = Integer.parseInt(a);
            int b1 = Integer.parseInt(a1);

            int sum = b1 + b;
        System.out.println("Sum = " + sum);
    }

}
