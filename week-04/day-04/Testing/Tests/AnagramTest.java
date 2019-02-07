import anagram.Anagram;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    // Recommended naming of the test method:
    // [MethodName_StateUnderTest_ExpectedBehavior]
    //
    // Like:
    // void sum_NegativeNumberAs1stParam_ReturnsZero()
    // void sum_NegativeNumberAs2ndParam_ExceptionThrown ()
    // void sum_SimpleValues_Calculated ()

    @Test
    public void areAnagrams_SimpleStrings_ReturnsCorrectValue(){
        Anagram anagram = new Anagram();
        assertTrue(anagram.areAnagrams("s4pI ll", "Llis p4"));
    }
}
