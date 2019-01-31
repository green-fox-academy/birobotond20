// Given a non-negative int n, return the sum of its digits recursively (no loops).
// Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
// divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

public class SumDigit {

    public static void main(String[] args) {

        System.out.println(sumOfDigits(126));
    }

    private static int sumOfDigits(int n) {

        if (n < 0){
            n *=  -1;
        }

        if (n <= 0) {
            return 0;
        } else {
            System.out.println(n);
            return sumOfDigits(n / 10) + n % 10;
        }
    }
}
