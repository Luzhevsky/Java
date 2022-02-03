package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        double z1 = 0;
        double z2 = 0;
        double z3 = 0;
        double y = 0;
        double r = 0;
            for(double j = 0; j <= 60; j= j+0.1) {
            double t1 = j;
            //int t1 = (int)g;
            for (double i = 0; i < 60; i += 5) {
                z1 = i;
                z2 = i + 1;
                z3 = i + 2;
                y = i + 3;
                r = i + 4;
                if (t1 >= z1 && t1 < y) {
                    System.out.println("зелёный !" + " t1=" + t1 + "  z1=" + z1 + " z2=" + z2
                            +" z3=" + z3 + " y=" +y + " r=" +r);
                }
                if (t1 >= y && t1 < r) {
                    System.out.println("жёлтый !" + " t1=" + t1 + "  z1=" + z1 + " z2=" + z2
                            +" z3=" + z3 + " y=" +y + " r=" + r );
                }
                if (t1 >= r && t1 <(z1+5.0) )
                    //if (t1 >= 4 && t1 < 5)
                    {
                    System.out.println("красный !" + " t1=" + t1 + "  z1=" + z1 + " z2=" + z2
                            +" z3=" + z3 + " y=" +y + " r=" +r + " z1+5.0=" +(z1+5.0));
                }
            }
        }
        
    }
}