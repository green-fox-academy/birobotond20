//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial

import java.util.Scanner;

public class Factorio {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to calculate it's factorial: ");
        int number = scanner.nextInt();
        System.out.println(number + "! = " + factorio(number));
    }

    private static int factorio(int max){
        int factorial = 1;
        for (int i = 1; i <= max; i++){
            factorial *= i;
        }
        return factorial;
    }
}
