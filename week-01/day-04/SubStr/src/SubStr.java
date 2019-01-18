import java.util.Scanner;

public class SubStr {
    public static void main(String[] args) {
        //  Create a function that takes two strings as a parameter
        //  Returns the starting index where the second one is starting in the first one
        //  Returns `-1` if the second string is not in the first one

        String input, q;
        Scanner scanner = new Scanner(System.in);


        //  Example:
        System.out.println(subStr("this is what I'm searching in", "searching"));
        //  should print: `17`
        System.out.println(subStr("this is what I'm searching in", "not"));
        //  should print: `-1`
    }

    public static int subStr(String input, String q) throws NullPointerException {

        if (input == null || input.length() == 0){
            throw new NullPointerException("String is null or is of length 0");
        }

        input = input.toLowerCase().trim();
        q = q.toLowerCase().trim();
        int foundCharAt;
        int startIndex = 0;
        int startsAt = 0;

        for (int j=0; j < q.length(); j++){
            foundCharAt = input.indexOf(q.charAt(j), startIndex);
            if (foundCharAt < 0){
                return 1;
            }
            startIndex = foundCharAt;
        }


        return -1;
    }
}