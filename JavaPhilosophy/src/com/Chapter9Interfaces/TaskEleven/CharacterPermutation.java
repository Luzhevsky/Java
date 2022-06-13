package com.Chapter9Interfaces.TaskEleven;

import com.Chapter9Interfaces.Test.NewProcessor.Processor ;
import com.Chapter9Interfaces.Test.NewProcessor.Apply;

public class CharacterPermutation implements Processor{

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

    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    @Override
    public String process(Object input) {
        return  Permutation((String)input);
    }
}

class Main {
    public static void main(String[] args) throws Exception {
        CharacterPermutation characterPermutation = new CharacterPermutation();

        System.out.println(characterPermutation.process("fsdf"));

        Apply.process(new CharacterPermutation(), "gfjhaq");
    }
}