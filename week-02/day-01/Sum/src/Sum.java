//  Create the usual class wrapper
//  and main method on your own.

// - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the upper limit: ");
        int upperLimit = scanner.nextInt();
        System.out.println(sum(upperLimit));
    }

    private static int sum(int max){
        int sum = 0;
        for (int i = 1; i <= max; i++){
            sum += i;
        }
        return sum;
    }
}
