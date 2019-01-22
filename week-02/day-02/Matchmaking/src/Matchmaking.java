import java.util.*;

public class Matchmaking{
    public static void main(String... args){
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // If someone has no pair, he/she should be the element of the list too
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makingMatches(girls, boys));
    }

    private static ArrayList<String> makingMatches(ArrayList<String> girls, ArrayList<String> boys){
        ArrayList<String> matches = new ArrayList<>();  // Create the new ArrayList to return

        int index = girls.size();                       // Get the index based on which input's size
        if (boys.size() < girls.size()){                //  is greater
            index = boys.size();
        }

        for (int i = 0; i < index; i++){                // Iterate through the inputs and add
            matches.add(girls.get(i));                  // new elements one by one, one from each
            matches.add(boys.get(i));
        }

        matches.addAll(girls.subList(index, girls.size())); // Add the remaining elements
        matches.addAll(boys.subList(index, boys.size()));

        return matches;
    }
}