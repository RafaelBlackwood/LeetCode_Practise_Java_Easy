package com.company;

public class Dog extends Animal{

    @Override //annotation
    void speak() {
        System.out.println("The dog goes *bark*");
    }
}