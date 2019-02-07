package anagram;

import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {

    public boolean areAnagrams(String firstString, String secondString){

        if (firstString == null || secondString == null){
            return false;
        } else if (firstString.length() != secondString.length()){
            return false;
        } else if (firstString.isEmpty()){
            return false;
        }

        char[] firstStringArray = firstString.toLowerCase().toCharArray();
        char[] secondStringArray = secondString.toLowerCase().toCharArray();

        Arrays.sort(firstStringArray);
        Arrays.sort(secondStringArray);

        return Arrays.equals(firstStringArray, secondStringArray);
    }
}
