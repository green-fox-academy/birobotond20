import sun.rmi.runtime.Log;

import java.util.Scanner;

public class Calculator {
    public static void main(String... args) {
        // Create a simple calculator application which reads the parameters from the prompt
        // and prints the result to the prompt.
        // It should support the following operations,
        // create a method named "calculate()":
        // +, -, *, /, % and it should support two operands.
        // The format of the expressions must be: {operation} {operand} {operand}.
        // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

        // You can use the Scanner class
        // It should work like this:

        // Start the program
        // It prints: "Please type in the expression:"
        // Waits for the user input
        // Print the result to the prompt
        // Exit

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type in the expression (+ 3 3): ");
        char operation = scanner.next().charAt(0);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        System.out.println(calculate(operation, firstNumber, secondNumber));
    }

    private static int calculate(char operation, int firstNumber, int secondNumber) throws ArithmeticException{

        int result = 0;

        if (operation == '+') {
            result = firstNumber + secondNumber;
        } else if (operation == '-'){
            result = firstNumber - secondNumber;
        } else if (operation == '*'){
            result = firstNumber * secondNumber;
        } else if (operation == '/'){
            try {
                result = firstNumber / secondNumber;
            } catch (ArithmeticException e){
                System.out.println("Invalid operation on given numbers: " + e.getMessage());
            }
        } else if (operation == '%'){
            try {
                result = firstNumber % secondNumber;
            } catch (ArithmeticException e){
                System.out.println("Invalid operation on given numbers: " + e.getMessage());
            }
        }

        return result;
    }
}