package com.Chapter5.InitializationAndCompletion.VariableLengthArguments;

public class VariableLength20 {
    public static void main(String... args) {
        //Задание 20
        // Для изменения аргументов нажимаем edit configuration(Run->edit configuration->Program arguments) и меняем в IDEA
        for(String s : args){
            System.out.println(s);
        }
    }
}
