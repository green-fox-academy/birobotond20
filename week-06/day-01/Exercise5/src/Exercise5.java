import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise5 {

    public static void main(String[] args) {

        // Write a Stream Expression to get the sum of the odd numbers in the following list:
        List<Integer> numbers = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);

        // Method 1.
        int sumOfOddNumbers = numbers.stream()
                .filter(number -> number % 2 == 1 || number % 2 == -1)
                .reduce(0, (sum, number) -> sum += number);

        System.out.println(sumOfOddNumbers);

        // Method 2.
        int sumOfOddNumbers2 = numbers.stream()
                .filter(number -> number % 2 == 1 || number % 2 == -1)
                .mapToInt((number) -> number)
                .sum();

        System.out.println(sumOfOddNumbers2);
    }
}
