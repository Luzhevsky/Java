package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human grandfather = new Human("Коля", true, 67);
        Human grandfather2 = new Human("Ваня", true, 70);
        Human grandmother = new Human("Тома", false, 65);
        Human grandmother2 = new Human("Галя", false, 69);

        Human father = new Human("Валера", true, 40, grandfather2,grandmother2);
        Human mother = new Human("Наташа", false, 37, grandfather, grandmother);

        Human son = new Human("Дима", true, 23, father, mother);
        Human son2 = new Human("Ваня", true, 22,father, mother);
        Human son3 = new Human("Ваня2", true, 22, father, mother);
        System.out.println(grandfather.toString());
        System.out.println(grandfather2.toString());
        System.out.println(grandmother.toString());
        System.out.println(grandmother2.toString());

        System.out.println(mother.toString());
        System.out.println(father.toString());

        System.out.println(son.toString());
        System.out.println(son2.toString());
        System.out.println(son3.toString());


    }

    public static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name,boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name,boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father =father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}