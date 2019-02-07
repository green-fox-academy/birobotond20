import org.junit.Test;
import sum.Numbers;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

// Recommended naming of the class:
// [NameOfTheClassUnderTest + Tests]
public class SumTest {

    // Recommended naming of the test method:
    // [MethodName_StateUnderTest_ExpectedBehavior]
    //
    // Like:
    // void sum_NegativeNumberAs1stParam_ReturnsZero()
    // void sum_NegativeNumberAs2ndParam_ExceptionThrown ()
    // void sum_SimpleValues_Calculated ()

    Numbers myNumbers = new Numbers();

    @Test
    public void sum_MultipleElementList_ReturnCorrectSum(){
        ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        assertEquals(28, myNumbers.sum(numbersList));
    }

    @Test
    public void sum_EmptyList_ReturnCorrectSum(){
        ArrayList<Integer> numbersList = new ArrayList<>();
        assertEquals(0, myNumbers.sum(numbersList));
    }

    @Test
    public void sum_OneElementList_ReturnCorrectSum(){
        ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(2));
        assertEquals(2, myNumbers.sum(numbersList));
    }

    @Test
    public void sum_NullElement_ReturnCorrectSum(){
        assertEquals(0, myNumbers.sum(null));
    }
}
