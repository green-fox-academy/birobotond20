// Write a recursive function that takes one parameter: n and adds numbers from 1 to n.

public class NumberAdder {

    public static void main(String[] args) {

        System.out.println(numberAdder(-3));
    }

    private static int numberAdder(int n) {

        if (n == 1) {
            return 1;
        } else if (n > 1) {
            return numberAdder(n - 1) + n;
        } else {
            return numberAdder(n + 1) + n;
        }
    }
}
