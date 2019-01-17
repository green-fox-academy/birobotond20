// Write a program that reads a number from the standard input, then draws a
// diamond like this:
//
//
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
//
// The diamond should have as many lines as the number was

import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {

        int lines;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me the number of lines: ");
        lines = scanner.nextInt();

        for (int i = 1; i <= lines * 2 - 1; i++){
            for (int j = 1; j <= lines * 2 - 1; j++){
                if (i <= lines) {
                    if ((j <= lines + (i - 1)) && (j >= lines - (i - 1))) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if ((j > i - lines) && (j <= (lines*2-1) - (i-lines)) ) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
