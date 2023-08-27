package com.company;
import java.util.Random;

public class DiceRoller {
    Random random;//global
    int number;//global

    DiceRoller(){

        //Random random = new Random();
        random = new Random();
        roll();
    }

    void roll() {
        number = random.nextInt(6)+1;
        System.out.println(number);
    }
}
