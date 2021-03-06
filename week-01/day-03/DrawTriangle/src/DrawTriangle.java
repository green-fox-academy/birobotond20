// Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was

import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {

        int lines;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me the number of lines: ");
        lines = scanner.nextInt();

        for (int i = 1; i <= lines; i++){
            for (int j = 1; j <= lines - (lines - i); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}