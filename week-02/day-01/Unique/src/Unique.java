import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Unique {
    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as a parameter
        //  Returns a list of numbers where every number in the list occurs only once

        //  Example
            System.out.println(Arrays.toString(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34, 34, 34, 4, 2, 4, 2})));
        //  should print: `[1, 11, 34, 52, 61]`
        //unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34});
    }

    private static int[] unique(int[] numArray){
        int[] nr = new int[numArray.length];
        int numbersToExtract = numArray.length;
        for (int i = 0; i < numArray.length; i++){
            for (int j = i+1; j < numArray.length; j++) {
                if (numArray[j] == numArray[i]){
                    nr[i]++;
                    numbersToExtract--;
                    break;
                }
            }
        }

        int[] uniqueNumbers = new int[numbersToExtract];
        int uniqueIndex = 0;
        for (int i = 0; i < numArray.length; i++){
            if(nr[i] == 0){
                uniqueNumbers[uniqueIndex] = numArray[i];
                uniqueIndex++;
            }
        }

        Arrays.sort(uniqueNumbers);

        return uniqueNumbers;
    }
}