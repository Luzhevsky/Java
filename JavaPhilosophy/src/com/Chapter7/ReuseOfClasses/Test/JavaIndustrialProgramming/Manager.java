package com.Chapter7.ReuseOfClasses.Test.JavaIndustrialProgramming;

class Employee {
    private int id;
    public Employee(int idc){
        id = idc;
    }
    public int getId(){
        return id;
    }
    public void typeEmployee() {
        System.out.println("Работник");
    }
}

public class Manager extends Employee{
    private int idProject;

    public Manager(int idc, int idp){
        super(idc);
        idProject = idp;
    }
    public int getIdProject(){
        return idProject;
    }
    public void typeEmployee() {
        System.out.println("Менеджер");
    }
}

class Runner {
    public static void main(String[] args) {
        Employee b1 = new Employee(7110);
        Employee b2 = new Manager(9251, 31);
        b1.typeEmployee();
        b2.typeEmployee();
       int a = ((Manager)b2).getIdProject();

        System.out.println("IdProject = " + a);

        Manager m2 = new Manager(9231,22);
        m2.typeEmployee();
        m2.getIdProject();
    }
}