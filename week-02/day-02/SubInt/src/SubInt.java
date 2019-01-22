import java.util.ArrayList;

public class SubInt {
    public static void main(String[] args) {
        //  Create a function that takes a number and a list of numbers as a parameter
        //  Returns the indeces of the numbers in the list where the first number is part of
        //  Returns an empty list if the number is not part any of the numbers in the list

        //  Example:
        System.out.println(subInt(1, new int[] {1, 11, 34, 52, 61}));
        //  should print: `[0, 1, 4]`
        System.out.println(subInt(9, new int[] {1, 11, 34, 52, 61}));
        //  should print: '[]'
    }

    private static String subInt(int find, int[] input){

        ArrayList<Integer> indices = new ArrayList<>();

        for (int i = 0; i < input.length; i++){
            int currentNumber = input[i];
            int remainder = 0;
            while (currentNumber > 0 ){
                remainder = currentNumber % 10;
                if (remainder == find){
                    indices.add(i);
                }
                currentNumber = remainder / 10;
            }
        }

        return indices.toString();
    }
}