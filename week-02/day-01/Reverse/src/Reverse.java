// - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`

import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {
        int[] aj = {3,4,5,6,7};
        int[] ajReverse = new int[aj.length];

        for (int i = 0; i < aj.length; i++){
            ajReverse[i] = aj[aj.length-1-i];
        }

        aj = ajReverse.clone();
        System.out.println(Arrays.toString(aj));
    }
}
