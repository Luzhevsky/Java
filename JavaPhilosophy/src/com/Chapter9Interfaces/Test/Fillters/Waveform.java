package com.Chapter9Interfaces.Test.Fillters;

public class Waveform {
    private static long counter;
    private final long id  = counter++;
    public String toString() {
        return "Waveform " + id;
    }
}



