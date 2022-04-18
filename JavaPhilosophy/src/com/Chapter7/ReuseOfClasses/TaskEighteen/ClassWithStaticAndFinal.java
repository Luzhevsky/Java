package com.Chapter7.ReuseOfClasses.TaskEighteen;

public class ClassWithStaticAndFinal {
    static String s = "Hello";
    public static final double PI = 3.141592;
    String sNoStatic = "Hi";
    static void go() {
        System.out.println(s.length());
        //System.out.println(sNoStatic); //В методе static не можем получить доступ к не статик методам.
    }
    void goNoStatic(){
        System.out.println(s.length());
        s = "SgoNoStatic";

    }

}
class go {
    public static void main(String[] args) {
        System.out.println("PI = " + ClassWithStaticAndFinal.PI);
        System.out.println("s = " + ClassWithStaticAndFinal.s);
        ClassWithStaticAndFinal.s = "Меняем значение статик переменной";
        System.out.println("s измененноая = " + ClassWithStaticAndFinal.s);
        ClassWithStaticAndFinal.go();

        ClassWithStaticAndFinal c = new ClassWithStaticAndFinal();
        c.goNoStatic();


    }
}
