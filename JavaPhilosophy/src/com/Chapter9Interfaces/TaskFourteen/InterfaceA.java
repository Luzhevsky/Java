package com.Chapter9Interfaces.TaskFourteen;

public interface InterfaceA {
    void OneA();
    void TwoA();
}

interface InterfaceB {
    void OneB();
    void TwoB();
}

interface InterfaceC {
    void OneC();
    void TwoC();
}

interface Son extends InterfaceA, InterfaceB, InterfaceC {
    void sonA();
}

class One {
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}

class Realization extends One implements Son {

    @Override
    public void OneA() {}
    public void TwoA() {}

    @Override
    public void OneB() {}
    public void TwoB() {}

    @Override
    public void OneC() {}
    public void TwoC() {}

    @Override
    public void sonA() {}

    public void method1(InterfaceA a) {
        System.out.println(a.getClass().getSimpleName()  + " method1");
    }

    public void method2(InterfaceB a) {
        System.out.println(a.getClass().getSimpleName() + " method2");
    }

    public void method3(InterfaceC a) {
        System.out.println(a.getClass().getSimpleName()  + " method3");
    }

    public void method4(Son a) {
        System.out.println(a.getClass().getSimpleName()  + " method4");
    }

}


class Main {
    public static void main(String[] args) {
        One r = new Realization();
        System.out.println(r);
        Realization realization = new Realization();
        realization.method1(realization);
        realization.method2(realization);
        realization.method3(realization);
        realization.method4(realization);
    }
}