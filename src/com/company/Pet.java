package com.company;

public class Pet {
    String name;
    int number;
    Pet(String name, int number){
        this.name = name;
        this.number = number;
    }
    public String toString(){
        return number + " " + name;
    }
}
