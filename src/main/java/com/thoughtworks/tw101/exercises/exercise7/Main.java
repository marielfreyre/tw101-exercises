package com.thoughtworks.tw101.exercises.exercise7;
import java.util.Scanner;

// Write a program that chooses a random number between 1 and 100. Then asks the user to enter a guess. If they guess
// right then tell them they win, otherwise tell them if they guessed too high or low. Keep asking the user to guess
// until they get the right answer. Use classes to separate the different concerns of this program.

public class Main {

    public static void main(String[] args) {
        int secretNumber = 55;
        boolean guessIsCorrect = false;
        int userInput=-1;
        while(!guessIsCorrect) {
            userInput = getUserInput();
            guessIsCorrect = checkUserInput(userInput, secretNumber);
            if(!guessIsCorrect) checkIfGuessIsHighOrLow(userInput, secretNumber);
        }
        System.out.print("Congratulations! "+userInput+" is correct.");

    }
    public static int getUserInput(){
        System.out.println("Please enter an integer guess: ");
        Scanner in = new Scanner(System.in);
        int userInput = in.nextInt();
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
