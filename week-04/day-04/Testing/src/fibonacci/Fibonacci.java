package fibonacci;

public class Fibonacci {

    public int generateFibonacciAtIndex(int index){

        if (index < 2){
            return 0;
        } else if (index == 2){
            return 1;
        } else {
            return generateFibonacciAtIndex(index - 2) + generateFibonacciAtIndex(index - 1);
        }
    }
}
