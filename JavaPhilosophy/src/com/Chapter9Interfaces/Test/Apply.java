package com.Chapter9Interfaces.Test;

import java.util.Arrays;

class Processor {
    public String name() {
        return getClass().getSimpleName();
    }
    Object process(Object input) {
        return input;
    }
}

class UpCase extends Processor {
    String process(Object input){
        return ((String)input).toUpperCase();
    }
}

class DownCase extends Processor {
    String process(Object input) {
        return ((String)input).toLowerCase();
    }
}

class Splitter extends Processor {
    String process(Object input) {
        return Arrays.toString(((String)input).split(" "));
    }
}

public class Apply {

    public static void process(Processor p , Object s){
        System.out.println("Используем Processor " + p.name());
        System.out.println(p.process(s));
    }

    public static void main(String[] args) {
       String s = "Disagreement with beliefs is by definition incorrect";
       process(new Splitter(), s);
       process(new DownCase(), s);
       process(new UpCase(), s);

    }
}
