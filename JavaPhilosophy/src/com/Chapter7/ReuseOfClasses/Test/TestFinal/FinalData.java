package com.Chapter7.ReuseOfClasses.Test.TestFinal;

import java.util.Random;

class Value {
    int i;
    public Value(int i){
        this.i = i;
    }
}

public class FinalData {
    private static Random rand = new Random(47);
    private String id;

    public FinalData(String id) {
        this.id = id;
    }
    //Могут быть константами времени компиляции:
    private final int valueOne = 9;
    private static final int VALUE_TWO = 99;

    //Типичная открытая константа
    public static final int VALUE_THREE = 39;

    //НЕ МОЖЕТ БЫТЬ констаной времени компиляции:
    private final int i4 = rand.nextInt(20);
    static final int INT_5 = rand.nextInt(20);

    private Value v1 = new Value(11);
    private final Value v2 = new Value(22);
    private static final Value VAL_3 = new Value(33);

    //массивы
    private final int[] a = {1, 2, 3, 4, 5, 6};
    public String toString() {
        return id + ": " + "i4 =" + i4 + ", INT_5 = " + INT_5;
    }

    public static void main(String[] args) {
        FinalData fd1 = new FinalData("fd1");
        //!fd1.valueOne++; Cannot assign a value to final variable 'valueOne'
        fd1.v2.i++;

        fd1.v1 = new Value(9);
        for (int i = 0; i < fd1.a.length; i++) {
            fd1.a[i]++;
        }
        //!fd1.v2 = new Value(0); final ссылку нельзя изменить
        //!fd1.VAL_3 = new Value(1); final ссылку нельзя изменить
        //!fd1.a = new int[3]; final

        System.out.println(fd1);
        System.out.println("Создаем FinalData");
        FinalData fd2 = new FinalData("fd2");
        System.out.println(fd1) ;
        System.out.println(fd2);
    }
}
