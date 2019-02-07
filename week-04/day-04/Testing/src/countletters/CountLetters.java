package countletters;

import java.util.HashMap;
import java.util.Map;

public class CountLetters {



    public HashMap<Character, Integer> returnLetterDictionary(String inputString){

        if (inputString == null || inputString.isEmpty()){
            return new HashMap<>();
        }

        HashMap<Character, Integer> dictionary = new HashMap<>();

        for (int i = 0; i < inputString.length(); i++){
            if (!dictionary.containsKey(inputString.charAt(i))){
                dictionary.put(inputString.charAt(i), 1);
            } else {
                dictionary.put(inputString.charAt(i), dictionary.get(inputString.charAt(i)) + 1);
            }
        }
        return dictionary;
    }
}
