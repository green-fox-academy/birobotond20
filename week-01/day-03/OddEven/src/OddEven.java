// Write a program that reads a number from the standard input,
// Then prints "Odd" if the number is odd, or "Even" if it is even.

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args){

        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me a number: ");
        number = scanner.nextInt();

        if (number % 2 == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
