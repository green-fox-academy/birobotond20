import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        int numbersOfChickens, numberOfPigs;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me the number of chickens and pigs the farmer has (separated by spaces): ");
        numbersOfChickens = scanner.nextInt();
        numberOfPigs = scanner.nextInt();
        int numberOfLegs = numbersOfChickens * 2 + numberOfPigs * 4;

        System.out.println("Total number of legs: " + numberOfLegs);
    }
}