package com.company;
import java.awt.*;
import java.sql.SQLOutput;
//git

public class Main {

    static class People{
        private int age;
        private String name;
        private int height;
        private String address;
        private People(){
            System.out.println("Данные не заданны");
        }
        public People (int age_people, String name_people, int height_people, String address_people){
                age = age_people;
                name = name_people;
                height = height_people;
                address = address_people;
        }
        
        public void set_age(int age_people){
            this.age = age_people;
        }

    }
    public static void main(String[] args) {
	// write your code here
        People Noname = new People();
        People dmitriy = new People(18,"Дмитрий",  100, "Щелковское шоссе, 59");
        System.out.println(dmitriy.toString());

    }
}
