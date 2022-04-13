package com.Chapter7.ReuseOfClasses.TaskThirteen;

public class TypeOfVariable {

    public void type(int i){
        System.out.println("type(int)");
    }
    public void type(double d){
        System.out.println("type(double)");
    }
    public void type(String s){
        System.out.println("type(String)");
    }

}
class TypeExtension extends TypeOfVariable {
    public void type(Object o){
        System.out.println("type(Object)");
    }

    public static void main(String[] args) {
        TypeExtension t = new TypeExtension();
        t.type(123);
        t.type(123.2);
        t.type("Hello");
        t.type(t);
    }
}
