// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0

import java.util.Scanner;

public class DivideByZero {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me the number with which I should divide 10: ");
        int divisor = scanner.nextInt();
        System.out.println(divideTwoNumbers(divisor));
    }

    private static int divideTwoNumbers(int divisor){
        int quotient = 0;

        try {
            quotient = 10 / divisor;
            return quotient;
        } catch (ArithmeticException e){
            System.err.println("fail");
        }
        return quotient;
    }
}
