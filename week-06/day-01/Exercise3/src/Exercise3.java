import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise3 {

    public static void main(String[] args) {

        // Write a Stream Expression to find which number squared value is more than 20 from the following list:
        List<Integer> numbers = Arrays.asList(3, 9, 2, 8, 6, 5);

        List<Integer> squaredGreaterThan20 = numbers.stream()
                .filter(number -> number * number > 20)
                .collect(Collectors.toList());

        System.out.println(squaredGreaterThan20);
    }
}
