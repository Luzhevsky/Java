package com.Chapter10InnerClasses.TaskTwentyOne;

public interface U {
    void method1();
    void method2();
    void method3();
}

class A {
    public U LinkU() {
        return new U(){
            @Override
            public void method1() {
                System.out.println(this.getClass().getSimpleName() + " method 1");
            }

            @Override
            public void method2() {
                System.out.println(this.getClass().getSimpleName() + " method 2");
            }

            @Override
            public void method3() {
                System.out.println(this.getClass().getSimpleName() + " method 3");
            }
        };
    }
}

class B {
    U[] massU = new U[15];
    public int len = 0;
    public void saveU(A linkA) {
       massU[len++] = linkA.LinkU();
    }

    public void deleteU(int c) {
        for (int i = 0; i < massU.length; i++) {
            if(i == c){
                massU[i] = null;
            }
        }
    }

    public void iterationU() {
        for (U u : massU) {
            if(u == null) {
                System.out.println("U is null");
            } else {
                u.method1();
                u.method2();
                u.method3();
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        A one = new A();
        A two = new A();
        A three = new A();
        //У разных A разные ссылки, так как они создаются разными внутренними классами.

        B oneB = new B();
        oneB.saveU(one);
        oneB.saveU(two);
        oneB.saveU(three);


        oneB.iterationU();
        System.out.println();
        oneB.deleteU(1);
        oneB.iterationU();

    }
}