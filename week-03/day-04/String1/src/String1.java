// Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.

public class String1 {

    public static void main(String[] args) {

        System.out.println(replaceXWithY("XxXxXx"));
    }

    private static String replaceXWithY(String string) {

        int n = string.length();

        if (string.isEmpty()) {
            return string;
        } else {
            return string.substring(0, 1).replace('x', 'y') + replaceXWithY(string.substring(1, n));
        }
    }
}
