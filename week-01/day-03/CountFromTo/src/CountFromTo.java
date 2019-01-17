// Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5

import java.util.Scanner;

public class CountFromTo {

    public static void main(String[] args) {

        int number1, number2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me two numbers: ");
        number1 = scanner.nextInt();
        number2 = scanner.nextInt();

        if (number2 > number1){
            for (int i = number1; i < number2; i++){
                System.out.println(i);
            }
        } else {
            System.out.println("The second number should be bigger!");
        }
    }
}
