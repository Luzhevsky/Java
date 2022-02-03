package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        //напишите тут ваш код
        int[] mass = new int[20];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = Integer.parseInt(reader.readLine());
        }
        maximum = mass[0];
        minimum = mass[0];
        for (int i = 0; i < mass.length; i++) {
            if(maximum <= mass[i]){
                maximum = mass[i];
            }
            if(minimum >= mass[i]){
                minimum = mass[i];
            }
        }

        System.out.print(maximum + " " + minimum);
    }
}
