// Write a program that asks for two numbers and prints the bigger one

import java.util.Scanner;

public class PrintBigger {

    public static void main(String[] args) {

        int number1, number2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me two numbers: ");

        number1 = scanner.nextInt();
        number2 = scanner.nextInt();

        if (number1 > number2){
            System.out.println(number1);
        } else if (number1 < number2) {
            System.out.println(number2);
        } else {
            System.out.println("equal");
        }
    }
}
