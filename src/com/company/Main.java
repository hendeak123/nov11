package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        IFunWithQueue<Pet> funWithQueue = new FunWithQueue<Pet>();
        Pet[] numbers = new Pet[7];
        numbers[0] = new Pet("Joe", 5);
        numbers[1] = new Pet("George", 35);
        numbers[2] = new Pet("Eddy", 100);
        numbers[3] = new Pet("Jackson", 4);
        numbers[4] = new Pet("Zeus", 42);
        numbers[5] = new Pet("Poseidon", 11);
        numbers[6] = new Pet("Hades", 21);
        funWithQueue.initializeQueue(numbers);
    }
}
