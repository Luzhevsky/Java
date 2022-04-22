package com.Chapter7.ReuseOfClasses.TaskTwenty;

class WithFinals {
    private final void f(){
        System.out.println("WithFinals.f()");
    }
    private void g() {
        System.out.println("WithFinals.g()");
    }
}

class OverridingPrivate extends WithFinals {

    private final void f() {
        System.out.println("OverridingPrivate.f()");
    }

    private void g() {
        System.out.println("OverridingPrivate.g()");
    }
}

class OverridingPrivate2 extends WithFinals {

    //@Override //error:Метод не переопределяет метод из своего суперкласса
    //Если использовать Override, то компилятор выдаст ошибку если это не переопределение.
    public final void f(){
        System.out.println("OverridingPrivate2.f()");
    }

    public void g(){
        System.out.println("OverridingPrivate2.g()");
    }
}


public class FinalOverridingIllusion {
    public static void main(String[] args) {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();


    }
}
