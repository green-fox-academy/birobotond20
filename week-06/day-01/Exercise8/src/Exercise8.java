import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Exercise8 {

    public static void main(String[] args) {

        // Write a Stream Expression to concatenate a Character list to a string!
        List<Character> someList = Arrays.asList('a', 'b', 'c', 'd');

        String someString = someList.stream()
                .filter(Objects::nonNull)
                .map(Object::toString)
                .collect(Collectors.joining(" "));

        System.out.println(someString);
    }
}
