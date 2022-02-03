package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] a = new int[5];
        int bu;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < a.length; i++){
            a[i] = Integer.parseInt(reader.readLine());
        }

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length - 1;j++){
                if(a[j] > a[j + 1]){
                    bu = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = bu;
                }
            }

        }
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
        //напишите тут ваш код
    }
}
