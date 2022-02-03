package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String nameGrandFather = reader.readLine();
        Cat catGrandFather = new Cat(nameGrandFather,null,null);

        String nameGrandMother = reader.readLine();
        Cat catGrandMother = new Cat(nameGrandMother,null,null);

        String nameFather = reader.readLine();
        Cat catFather = new Cat(nameFather, null, catGrandFather);

        String nameMother = reader.readLine();
        Cat catMother = new Cat(nameMother, catGrandMother, null);

        String nameSon = reader.readLine();
        Cat catSon = new Cat(nameSon, catMother, catFather);

        String nameDaughter = reader.readLine();
        Cat catDaughter  = new Cat(nameDaughter, catMother, catFather);

//
//
//
//        String nameMother = reader.readLine();
//        Cat catMother = new Cat(nameMother, catGrandMother);

        System.out.println(catGrandFather);
        System.out.println(catGrandMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);


    }

    public static class Cat {
        private String name;

        private Cat Father;
        private Cat Mother;

        Cat(){

        }
        Cat(String name,Cat Mother, Cat Father) {
                this.name = name;
                this.Father = Father;
                this.Mother = Mother;
        }

        @Override
        public String toString() {
            if(Father == null && Mother == null)
                return "The cat's name is " + name + ", no mother, no father";
            if(Mother == null)
                return "The cat's name is " + name + ", no mother, father is " + Father.name;
            if(Father == null)
                return "The cat's name is " + name + ", mother is "+ Mother.name +", no father";
            else
                return "The cat's name is " + name + ", mother is "+ Mother.name +", father is " + Father.name;
        }
    }

}
