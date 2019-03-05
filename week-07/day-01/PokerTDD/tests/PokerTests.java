import org.junit.Test;
import static org.junit.Assert.*;

public class PokerTests {

    @Test
    public void pokerHands_returnHighCardAce(){
        assertEquals("White wins! - (High card: 14)", Poker.pokerHands("Black: 2H 3D 5S 9C KD White: 2C 3H 4S 8C AH"));
    }

    @Test
    public void pokerHands_returnHighCardAceFalse(){
        assertEquals("Black wins! - (High card: 13)", Poker.pokerHands("Black: 2H 3D 5S 9C KD White: 2C 3H 4S 8C 10H"));
    }
}
