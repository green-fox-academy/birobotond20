import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercise6 {

    public static void main(String[] args) {

        // Write a Stream Expression to find the uppercase characters in a string!
        IntStream stringCharacters = "UpperCaseCharacter".chars();

        // Method 1.
        /*stringCharacters
                .filter(Character::isUpperCase)
                .mapToObj(character -> Character.toString((char)character))
                .forEach(System.out::println);*/

        // Method 2.
        String uppercaseCharacter =
                stringCharacters
                        .filter(Character::isUpperCase)
                        .mapToObj(character -> Character.toString((char) character))
                        .collect(Collectors.joining());
        System.out.println(uppercaseCharacter);
    }
}
