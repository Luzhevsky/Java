package com.Chapter5.InitializationAndCompletion.Enum;

import java.sql.SQLOutput;

public class Enum {
    Currency currency;
    public Enum(Currency currency){
        this.currency = currency;
    }
    public void infoCurrency(){
        switch (currency){
            case EURO:
                System.out.println("Евро валюта используемая в европе"); break;
            case LIRA:
                System.out.println("Лира валюта используемая в Турции"); break;
            case YUAN:
                System.out.println("Юань валюта используемая в Китае"); break;
            case DINAR:
                System.out.println("Динар валюта используемая в Югославии"); break;
            case RUBLE:
                System.out.println("Рубль валюта используемая в России"); break;
            case DOLLAR:
                System.out.println("Доллар валюта использемая в USA"); break;
            default:
                System.out.println("Данная валюта не найдена ");
        }
    }

    public static void main(String[] args) {
        //Задание 21.
        for (Currency s : Currency.values()){
            System.out.println(s + " ordinal = " + s.ordinal());
        }
        //Задание 22.
        Enum ruble = new Enum(Currency.RUBLE);
        Enum euro = new Enum(Currency.EURO);
        Enum dinar = new Enum(Currency.DINAR);
        Enum dolar = new Enum(Currency.DOLLAR);
        Enum lira = new Enum(Currency.LIRA);
        Enum Yuan = new Enum(Currency.YUAN);
        ruble.infoCurrency();
        euro.infoCurrency();
        dinar.infoCurrency();
        dolar.infoCurrency();
        lira.infoCurrency();
        Yuan.infoCurrency();
        //Задание 22.

    }
}
