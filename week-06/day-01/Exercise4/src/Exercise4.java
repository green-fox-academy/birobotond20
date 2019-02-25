import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Exercise4 {

    public static void main(String[] args) {

        // Write a Stream Expression to get the average value of the odd numbers from the following list:
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

        // Method 1.
        double averageOfOddNumbers = numbers.stream()
                .filter(number -> number % 2 == 1 || number % 2 == -1)
                .mapToInt((number) -> number)
                .summaryStatistics().getAverage();

        System.out.println(averageOfOddNumbers);

        // Method 2.
        double averageOfOddNumbers2 = numbers.stream()
                .filter(number -> number % 2 == 1 || number % 2 == -1)
                .collect(Collectors.averagingDouble(number -> number));

        System.out.println(averageOfOddNumbers2);
    }
}
