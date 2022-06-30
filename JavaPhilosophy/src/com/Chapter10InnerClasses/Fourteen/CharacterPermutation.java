package com.Chapter10InnerClasses.Fourteen;

import com.Chapter10InnerClasses.Fourteen.NewProcessor.Apply;
import com.Chapter10InnerClasses.Fourteen.NewProcessor.Processor;

public class CharacterPermutation{

    public String Permutation(String str) {
        char k;
        StringBuilder s = new StringBuilder();
        char[] c = str.toCharArray();

        for (int i = 0; i < c.length - 1; i+=2) {
            k = c[i];
            c[i] = c[i + 1];
            c[i + 1] = k;
        }

        for(char ch: c){
            s.append(ch);
        }

        return s.toString();
    }

    public Processor process(){
        return new Processor() {
            public String name() {
                return getClass().getSimpleName();
            }
            public String process(Object input) {
                return  Permutation((String)input);
            }
        };
    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Processor processor = new CharacterPermutation().process();

        System.out.println(processor.process("fsdf"));

        Apply.process(new CharacterPermutation().process(), "gfjhaq");
    }
}