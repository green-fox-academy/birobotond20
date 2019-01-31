// We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
// (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
// have 3 ears, because they each have a raised foot. Recursively return the
// number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

public class Bunny2 {

    public static void main(String[] args) {

        System.out.println(numberOfBunnyEars(10));
    }

    private static int numberOfBunnyEars(int bunnyInLine){

        if (bunnyInLine <= 0){
            return 0;
        } else {
            if (bunnyInLine % 2 == 0){
                return numberOfBunnyEars(bunnyInLine - 1) + 3;
            } else {
                return numberOfBunnyEars(bunnyInLine - 1) + 2;
            }
        }
    }
}
