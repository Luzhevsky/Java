package com.Chapter10InnerClasses.TaskSix.NewPackage2;

import com.Chapter10InnerClasses.TaskSix.InterfaceOne;
import com.Chapter10InnerClasses.TaskSix.NewPackage.M;

public class Arbitrary {
    public void metod() {
        M m = new M();
        //!InterfaceOne interfaceOne = m.new InnerPM();
        InterfaceOne one = m.Inner();
        System.out.println(one.returnName());

    }

    public static void main(String[] args) {
        Arbitrary a = new Arbitrary();
        a.metod();
    }
}
