import java.util.Scanner;

public class SubStr {
    public static void main(String[] args) {
        //  Create a function that takes two strings as a parameter
        //  Returns the starting index where the second one is starting in the first one
        //  Returns `-1` if the second string is not in the first one

        //  Example:
        // System.out.println(subStr("this is what I'm searching in", "searching"));
        //  should print: `17`
        // System.out.println(subStr("this is what I'm searching in", "not"));
        //  should print: `-1`

        String input = "";
        String word = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me the string to search in: ");
        input = scanner.nextLine();
        System.out.println("Please give me the string to search for: ");
        word = scanner.nextLine();
        System.out.println(subStr(input, word));

    }

    private static int subStr(String input, String word) throws NullPointerException {

        if (input == null || input.length() == 0){
            throw new NullPointerException("String is null or is of length 0");
        }

        input = input.toLowerCase().trim();
        word = word.toLowerCase().trim();
        StringBuilder substr = new StringBuilder();
        int lastGoodIndex = input.length() - word.length();
        int foundCharIndex;

        for (int i=0; i <= lastGoodIndex; i++){
            substr.delete(0,substr.length());
            foundCharIndex = input.indexOf(word.charAt(0), i);
            if (foundCharIndex < 0 || foundCharIndex > lastGoodIndex) {
                return - 1;
            } else {
                substr.append(input, foundCharIndex, foundCharIndex + word.length());
                if (word.contentEquals(substr)) {
                    return foundCharIndex;
                }
            }
        }
        return -1;
    }
}