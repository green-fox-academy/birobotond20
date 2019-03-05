import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class Poker {



    static String pokerHands(String input){
        input = replaceCharCardValueWithNumber(input);
        String[] blackHandCards = input.split("[A-Za-z]+: ")[1].trim().split(" ");
        String[] whiteHandCards = input.split("[A-Za-z]+: ")[2].trim().split(" ");

        String blackHighestCard = Arrays.stream(blackHandCards)
                .max(Comparator.comparingInt(a -> Integer.parseInt(a.substring(0, a.length() - 1))))
                .get();

        String whiteHighestCard = Arrays.stream(whiteHandCards)
                .max(Comparator.comparingInt(a -> Integer.parseInt(a.substring(0, a.length() - 1))))
                .get();

        if (Integer.parseInt(whiteHighestCard.substring(0, whiteHighestCard.length() - 1)) > Integer.parseInt(blackHighestCard.substring(0, blackHighestCard.length() - 1))){
            return "White wins! - (High card: " + Integer.parseInt(whiteHighestCard.substring(0, whiteHighestCard.length() - 1)) +")";
        } else {
            return "Black wins! - (High card: " + Integer.parseInt(blackHighestCard.substring(0, blackHighestCard.length() - 1)) +")";
        }
    }

    private static String replaceCharCardValueWithNumber(String hand){

        hand = hand.replaceAll("J", "11");
        hand = hand.replaceAll("Q", "12");
        hand = hand.replaceAll("K", "13");
        hand = hand.replaceAll("A", "14");
        return hand;
    }
}
