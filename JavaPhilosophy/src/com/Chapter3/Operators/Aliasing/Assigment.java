package com.Chapter3.Operators.Aliasing;

public class Assigment {
    public static void main(String[] args) {
        Tank tank1 = new Tank();
        Tank tank2 = new Tank();
        tank1.level = 25.1f;
        tank2.level = 34.5f;
        System.out.println(" tank1.level = " + tank1.level + ", tank2.level = " + tank2.level);
        tank1 = tank2;
        System.out.println(" tank1.level = " + tank1.level + ", tank2.level = " + tank2.level);
        tank1.level = 11.1f;
        System.out.println(" tank1.level = " + tank1.level + ", tank2.level = " + tank2.level);
    }
}
