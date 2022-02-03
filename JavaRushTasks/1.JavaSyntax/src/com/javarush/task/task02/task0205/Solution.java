package com.javarush.task.task02.task0205;

/* 
Прибавка к зарплате
*/
public class Solution {
    public static void main(String[] args) {
        int j = 1;
            for (int i = 1; i <= 10; i++)
            {
                j = j * i;
                if(i == 10)
                    System.out.println(j);
            }
    }
}