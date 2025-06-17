package inClassExercises.sheet1.exercise1;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int numberToGuess = (int) (Math.random() * 20) + 1; // Random number between 1 and 20
        Scanner scanner = new Scanner(System.in);
        int numberOfTries = 5 ;
        boolean isRight = false ;

        for(int i = 1 ; i<=numberOfTries; i++) {
            System.out.println("Guess the random number within 5 tries");
            int num = scanner.nextInt();
            if(num == numberToGuess) {
                numberOfTries = 0 ;
                isRight = true ;
                break;
            } else if (num > numberToGuess) {
                numberOfTries-=1 ;
                System.out.println("Too high! Try again.");
            } else {
                numberOfTries-=1 ;
                System.out.println("Too low! Try again.");
            }
        }
        if(isRight == true) {
            System.out.println("You win! :) Congrats!");
        } else {
            System.out.println("You lose. :( Pls try again.");
        }
    }
    
}
