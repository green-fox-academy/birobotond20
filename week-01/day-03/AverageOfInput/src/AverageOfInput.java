// Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4

import java.util.Scanner;

public class AverageOfInput {

    public static void main(String[] args){

        int number1, number2, number3, number4, number5, sum;
        double average;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me 5 numbers in a row: ");

        number1 = scanner.nextInt();
        number2 = scanner.nextInt();
        number3 = scanner.nextInt();
        number4 = scanner.nextInt();
        number5 = scanner.nextInt();

        sum = number1 + number2 + number3 + number4 + number5;
        average = sum / 5.;

        System.out.println("Sum: " + sum + ", Average: " + average);
    }
}