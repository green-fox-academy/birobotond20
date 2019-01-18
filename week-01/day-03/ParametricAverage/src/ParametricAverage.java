// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4

import java.util.Scanner;

public class ParametricAverage {

    public static void main(String[] args) {
        int numberOfItems, currentnumber;
        double sum = 0;
        double average = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("I will calculate to you the sum and the average of the integers you give me." +
                "\nPlease give me the number of times you will enter integers: ");
        numberOfItems = scanner.nextInt();

        for (int i = 0; i < numberOfItems; i++){
            System.out.println("Give me #" + (i + 1) + ".: ");
            currentnumber = scanner.nextInt();
            sum += currentnumber;
        }
        average = sum / numberOfItems;

        System.out.println("Sum: " + sum + ", Average: " + average);
    }
}
