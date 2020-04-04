package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main{

            private int age;
            private int height;

            public void setAge(int a) {
                age = a;

            }

            public void setHeight(int h) {
                height = h;
            }

    public static void main(String[] args) {

        Main sam = new Main();

        try{
            FileOutputStream fs = new FileOutputStream("serilizable.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(sam);
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}

