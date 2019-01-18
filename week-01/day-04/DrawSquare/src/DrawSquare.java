// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%%
// %    %
// %    %
// %    %
// %    %
// %%%%%%
//
// The square should have as many lines as the number was

import java.util.Scanner;

public class DrawSquare {

    public static void main(String[] args) {

        int lines;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me the number of lines: ");
        lines = scanner.nextInt();

        for (int row = 0; row < lines; row++){
            for (int col = 0; col < lines; col ++){
                if (row == 0 || row == lines - 1 || col == 0 || col == lines - 1){
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
