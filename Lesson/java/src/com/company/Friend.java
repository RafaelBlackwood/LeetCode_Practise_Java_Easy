package com.company;

public class Friend {

    String name;

    static int numberOfFriends;

    Friend(String name){
        this.name=name;
        numberOfFriends++;
    }

    static void displayFriends(){
        System.out.printf("You have %d friends",numberOfFriends);
    }

}
