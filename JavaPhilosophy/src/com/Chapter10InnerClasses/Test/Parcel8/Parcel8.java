package com.Chapter10InnerClasses.Test.Parcel8;

public class Parcel8 {
    Wrapping wrapping(int x) {
        return new Wrapping(x) {
            public int value() {
                return super.value() * 10;
            }
        };
    }

    public static void main(String[] args) {
        Parcel8 parcel8 = new Parcel8();
        Wrapping wrapping = parcel8.wrapping(4);
        System.out.println(wrapping.value());
    }
}
