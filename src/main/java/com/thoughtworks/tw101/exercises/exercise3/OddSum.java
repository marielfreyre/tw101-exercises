package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {

    public int of(int start, int end) {
        int sum = 0;

        if(start%2 == 0){
            start++;
        }
        else {
            start = start+2;
        }

        for(int current=start; current<end; current=current+2){
            sum=sum+current;
        }
        return sum;






    }
}
