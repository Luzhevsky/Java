package com.Chapter7.ReuseOfClasses.TaskFifteen;

public class ClassWithProtected {
    private int Damage;

    protected void setDamage(int Damage){
        this.Damage = Damage;
        System.out.println();
    }
    protected int getDamage(){
        return this.Damage;
    }
    public String s;
}
