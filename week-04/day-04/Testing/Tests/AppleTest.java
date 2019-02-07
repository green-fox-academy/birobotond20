import apples.Apple;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


// Recommended naming of the class:
// [NameOfTheClassUnderTest + Tests]
public class AppleTest {

    // Recommended naming of the test method:
    // [MethodName_StateUnderTest_ExpectedBehavior]
    //
    // Like:
    // void sum_NegativeNumberAs1stParam_ReturnsZero()
    // void sum_NegativeNumberAs2ndParam_ExceptionThrown ()
    // void sum_SimpleValues_Calculated ()

    Apple apple = new Apple();
    String expectedValue = "apple";

    @Test
    public void getApple_TestReturnedValue() {
        assertEquals(expectedValue, apple.getApple());
    }
}