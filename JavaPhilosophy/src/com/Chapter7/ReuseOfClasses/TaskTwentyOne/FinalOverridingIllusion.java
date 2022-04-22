package com.Chapter7.ReuseOfClasses.TaskTwentyOne;

class WithFinals {
    public final void f(){
        System.out.println("WithFinals.f()");
    }
    public void g() {
        System.out.println("WithFinals.g()");
    }
}

class OverridingFinal extends WithFinals {


//!   public final void f(){ // overridden method is final
//!       System.out.println("WithFinals.f()");
//!   }

}


public class FinalOverridingIllusion {
    public static void main(String[] args) {

    }
}
