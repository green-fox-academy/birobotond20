import fibonacci.Fibonacci;
import org.junit.Test;

import java.nio.file.Files;

import static org.junit.Assert.*;

public class FibonacciTester {

    @Test
    public void generateFibonacciAtIndex_PositiveInteger_ReturnCorrectFibonacci(){
        Fibonacci fibonacci = new Fibonacci();
        int result = fibonacci.generateFibonacciAtIndex(8);

        assertEquals(13, result);
    }

    @Test
    public void generateFibonacciAtIndex_NegativeInteger_ReturnCorrectFibonacci(){
        Fibonacci fibonacci = new Fibonacci();
        int result = fibonacci.generateFibonacciAtIndex(-5);

        assertEquals(0, result);
    }

    @Test
    public void generateFibonacciAtIndex_Zero_ReturnCorrectFibonacci(){
        Fibonacci fibonacci = new Fibonacci();
        int result = fibonacci.generateFibonacciAtIndex(0);

        assertEquals(0, result);
    }
}
