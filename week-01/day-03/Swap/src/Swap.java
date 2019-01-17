public class Swap {
    public static void main(String[] args) {
        // Swap the values of the variables
        int a = 123;
        int b = 526;
        int c;

        // Method 1
        // c = a;
        // a = b;
        // b = c;

        // Method 2
        b += a;
        a = b - a;
        b = b - a;

        System.out.println(a);
        System.out.println(b);
    }
}