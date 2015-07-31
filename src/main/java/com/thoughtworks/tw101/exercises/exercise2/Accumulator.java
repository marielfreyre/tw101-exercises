package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {
    //Instance Variables
    private int numberOfTimesIncrementCalled=0;

    public void increment(){
        numberOfTimesIncrementCalled++;
    }

    public int total(){
        return numberOfTimesIncrementCalled;
    }


}
