package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            String sc = String.valueOf(c[i]);

            if(sc.equals(" ") && !(String.valueOf(c[i+1])).equals(" ")){
                c[i + 1] = Character.toUpperCase(c[i + 1]);
            }
            else if(!(String.valueOf(c[0])).equals(" ")){
                c[0] = Character.toUpperCase(c[0]);
            }
        }
        System.out.println(c);
    }
}