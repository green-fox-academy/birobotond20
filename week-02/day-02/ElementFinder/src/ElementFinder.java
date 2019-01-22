import java.util.*;

public class ElementFinder{
    public static void main(String... args){
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(containsSeven(arrayList));
        // Write a method that checks if the arrayList contains "7" if it contains return "Hoorray" otherwise return "Noooooo"
        // The output should be: "Noooooo"
        // Do this again with a different solution using different list methods!

    }

    // Method 1
    /*private static String containsSeven(ArrayList<Integer> input){

        for (Integer item : input){
            if (item == 7){
                return "Hoorray";
            }
        }
        return "Noooooo";
    }*/

    // Method 2
    private static String containsSeven(ArrayList<Integer> input){

        if (input.contains(7)){
            return "Hoorray";
        }
        return "Noooooo";
    }
}