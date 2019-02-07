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
    public void areAnagrams_SimpleStrings_ReturnsTrue(){
        Anagram anagram = new Anagram();
        assertTrue(anagram.areAnagrams("listen", "silent"));
    }

    @Test
    public void areAnagrams_UpperAndLowerCaseChars_ReturnsTrue(){
        Anagram anagram = new Anagram();
        assertTrue(anagram.areAnagrams("Listen", "silEnt"));
    }

    @Test
    public void areAnagrams_StringWithWhitespace_ReturnsTrue(){
        Anagram anagram = new Anagram();
        assertTrue(anagram.areAnagrams("lis ten", " silent"));
    }

    @Test
    public void areAnagrams_StringWithNumbers_ReturnsTrue(){
        Anagram anagram = new Anagram();
        assertTrue(anagram.areAnagrams("list3n", "sil3nt"));
    }

    @Test
    public void areAnagrams_SimpleStrings_ReturnsFalse(){
        Anagram anagram = new Anagram();
        assertFalse(anagram.areAnagrams("listend", "silent"));
    }

    @Test
    public void areAnagrams_NullValues_ReturnsFalse(){
        Anagram anagram = new Anagram();
        anagram.areAnagrams(null, "nfkasnfsalk");
    }
}