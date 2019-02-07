import countletters.CountLetters;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountLettersTest {

    @Test
    public void returnLetterDictionary_SimpleString_ReturnHashMap(){
        CountLetters countLetters = new CountLetters();
        assertEquals("{ =4, a=4, b=2, t=1, e=2, u=1, y=1, l=3, m=1, n=2}",
                countLetters.returnLetterDictionary("elment a nyul a balba").toString());
    }
}
