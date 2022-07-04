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

    public void deleteU(A linkA) {
        System.out.println(massU[0].hashCode());
        System.out.println(massU[0]);
        System.out.println(massU[0].toString());
        for (int i = 0; i < massU.length; i++) {

            if(massU[i] == null) continue;
            if(linkA.equals(massU[i])){
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

        System.out.println(one.getClass());
        System.out.println(two.getClass());
        System.out.println(three.getClass());
        System.out.println();
        System.out.println(one.hashCode());
        System.out.println(two.hashCode());
        System.out.println(three.hashCode());
        System.out.println();
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        //У разных A разные ссылки, так как они создаются разными внутренними классами.

        B oneB = new B();
        System.out.println(one.hashCode());
        oneB.saveU(one);
        System.out.println("aaaaaaaaaaaaaaa" + oneB.massU[0].hashCode());
        oneB.saveU(two);
        oneB.saveU(three);


        oneB.iterationU();
        System.out.println();
        oneB.deleteU(one);
        oneB.iterationU();

    }
}