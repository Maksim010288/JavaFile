package com.company;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat();
        Dog doc = new Dog();

        doc.vois();
        doc.name = "Paster";
        String dogName = doc.name;
        String bread = doc.bread;
        doc.vois();
        System.out.println(dogName + "   " + bread);
        cat.vois();


    }
}
