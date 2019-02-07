package anagram;

public class Anagram {

    public boolean areAnagrams(String firstString, String secondString){

        firstString = firstString.toLowerCase().trim();
        secondString = secondString.toLowerCase().trim();
        String commonChars = "qwertyuiopasdfghjklzxcvbnm 1234567890";

        if (firstString.length() != secondString.length()){
            return false;
        } else if (firstString.isEmpty() || secondString.isEmpty()){
            return false;
        }

        for (int i = 0; i < firstString.length(); i++){
            int firstStringCurrentLetterCount = 0;
            int secondStringCurrentLetterCount = 0;
            for (int j = 0; j < commonChars.length(); j++) {
                if (firstString.charAt(i) == commonChars.charAt(j)){
                    firstStringCurrentLetterCount++;
                }

                if (secondString.charAt(i) == commonChars.charAt(j)){
                    secondStringCurrentLetterCount++;
                }
            }
            if (firstStringCurrentLetterCount != secondStringCurrentLetterCount){
                return false;
            }
        }

        return true;
    }
}
