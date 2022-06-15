package com.Chapter9Interfaces.TaskSixteen;

import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

public class RandomChars implements Readable{
    private static Random rand = new Random(47);
    private static final char[] lowers = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private int count;
    RandomChars(int count) {
        this.count = count;
    }
    public int read(CharBuffer cb) {
        if(count-- == 0) {
            return -1;
        }
        for (int i = 0; i < 4; i++) {
            cb.put(lowers[rand.nextInt(lowers.length)]);
        }
        cb.append(" ");
        return 3;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new RandomChars(2));
        while(s.hasNext()){
            System.out.println(s.next());
        }
    }


}
