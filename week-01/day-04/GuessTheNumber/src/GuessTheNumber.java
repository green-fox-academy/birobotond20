// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessTheNumber {

    public static void main(String[] args) {

        int numberToGuess = ThreadLocalRandom.current().nextInt(0, 20 + 1);;
        int guessedNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("I thought about a number between 0 and 20, guess it!\nWrite your number here: ");
        guessedNumber = scanner.nextInt();

        while (guessedNumber != numberToGuess){
            if (guessedNumber < numberToGuess){
                System.out.println("The stored number is higher");
                System.out.println("Try again: ");
                guessedNumber = scanner.nextInt();
            } else {
                System.out.println("The stored number is lower: ");
                System.out.println("Try again: ");
                guessedNumber = scanner.nextInt();
            }
        }

        System.out.println("You found the number: " + numberToGuess);
    }
}
