package com.Chapter7.ReuseOfClasses.TaskTwentyTwo;

final class Alfa {
    int j = 25;
    int i = 24;
    public void f(){

    }
}

class Beta /*!extends Alfa*/{//! Cannot inherit from final 'com.Chapter7.ReuseOfClasses.TaskTwentyTwo.Alfa'

}

public class ClassM {
}
