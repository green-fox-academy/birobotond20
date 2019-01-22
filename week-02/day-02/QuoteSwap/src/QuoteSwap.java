import java.util.*;

public class QuoteSwap{
    public static void main(String... args){
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

        // Accidentally I messed up this quote from Richard Feynman.
        // Two words are out of place
        // Your task is to fix it by swapping the right words with code
        // Create a method called quoteSwap().

        // Also, print the sentence to the output with spaces in between.
        System.out.println(quoteSwap(list));
        // Expected output: "What I cannot create I do not understand."
    }

    private static String quoteSwap(ArrayList<String> input){

        String wordCannot = "cannot";
        String wordDo = "do";
        String output = new String();

        for (int i = 0; i < input.size(); i++){
            if (input.get(i) == wordDo){
                input.set(input.indexOf(wordDo), wordCannot);
            } else if (input.get(i) == wordCannot){
                input.set(input.indexOf(wordCannot), wordDo);
            }
            if (i != input.size() - 1) {
                output += input.get(i) + " ";
            } else {
                output += input.get(i);
            }
        }

        return output;
    }
}