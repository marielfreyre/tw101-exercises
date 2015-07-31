package com.thoughtworks.tw101.exercises.exercise8;

// Exercise #8: Create a new version of Exercise #7 where you also record all of the user’s guesses and print them out
// once they guess correctly. Use an ArrayList to store the guesses. Catch the NumberFormatException and handle the case
// where the user entered a String that is not parseable.


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        int secretNumber = 55;
        boolean guessIsCorrect = false;
        int userInput=-1;
        ArrayList<Integer> listOfUserGuesses = new ArrayList<Integer>();
        while(!guessIsCorrect) {
            userInput = getUserInput();
            listOfUserGuesses.add(userInput);
            guessIsCorrect = checkUserInput(userInput, secretNumber);
            if(!guessIsCorrect && userInput != -1) checkIfGuessIsHighOrLow(userInput, secretNumber);
        }
        System.out.println("Congratulations! " + userInput + " is correct.");
        System.out.println("Here is a list of the guesses you made:");
        for(int i = 1; i<listOfUserGuesses.size(); i++){
            System.out.println(listOfUserGuesses.get(i));
        }

    }
    public static int getUserInput(){
       int userInput = -1;
        System.out.println("Please enter an integer guess: ");
        String stringInput = scan.next();
        try {
           userInput = Integer.parseInt(stringInput);

       } catch(NumberFormatException e){
            if(stringInput.equals("")){
                System.out.println("That's an empty string!");
            }
                System.out.println("Whoops! That's not a number.");

        }



        return userInput;



    }
    public static boolean checkUserInput(int userInput, int secretNumber){
        if(userInput==secretNumber){
            return true;
        }
        else{
            return false;
        }

    }
    public static void checkIfGuessIsHighOrLow(int userInput, int secretNumber){
        if(userInput > secretNumber){
            System.out.println("Sorry, that guess is too high!");
        }
        else{
            System.out.println("Sorry, that guess is too low!");
        }
    }


}
