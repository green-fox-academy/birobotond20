// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

public class Bunny1 {

    public static void main(String[] args) {

        System.out.println(numberOfBunnyEars(-24));
    }

    private static int numberOfBunnyEars(int numberOfBunnies){

        if (numberOfBunnies <= 0) {
            return 0;
        } else {
            return numberOfBunnyEars(numberOfBunnies - 1) + 2;
        }
    }
}
