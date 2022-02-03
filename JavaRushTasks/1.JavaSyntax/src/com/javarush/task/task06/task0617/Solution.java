package com.javarush.task.task06.task0617;

/* 
Блокнот для новых идей
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution  {
    public static void main(String[] args)throws IOException{
        printIdea(new Idea());
    }

    static public void printIdea(Idea idea)throws IOException{

        System.out.println(idea.getDescription());
    }
    //напишите тут ваш код
    public static class Idea{

        public String getDescription() throws IOException {
            String s = "egrgr";
            //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


                return s;

        }
    }
}
