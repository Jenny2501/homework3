package ru.geekbrains.oop.core.exers2;

import ru.geekbrains.oop.core.exers2.Personal;
import ru.geekbrains.oop.core.exers2.number;

import java.util.HashMap;

public class Phonelist {
    public static void main(String[] args) {
        HashMap<Personal, number> personalNumberHashMap = new HashMap<>();
        Personal ivanov = new Personal("Ivanov");
        Personal petrov = new Personal("Petrov");
        Personal petrov = new Personal("Petrov");
        Personal ivanov = new Personal("Ivanov");
        Personal sergeev = new Personal("Sergeev");


        Number number = new Number("17823459");
        Number number = new Number("78459611");
        Number number = new Number("17523450");
        Number number = new Number("74185296");
        Number number = new Number("12456378");
        //Добавление объектов
        personalNumberHashMap.put(ivanov, 17823459);
        personalNumberHashMap.put(ivanov, 78459611);
        personalNumberHashMap.put(petrov, 17523450);
        personalNumberHashMap.put(petrov, 74185296);
        personalNumberHashMap.put(sergeev, 12456378);


        //Получение объектов по ключу
        System.out.println(personalNumberHashMap.get(petrov));
        System.out.println(personalNumberHashMap.get(ivanov));
        System.out.println(personalNumberHashMap.get(sergeev));


    }
}