import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise7 {

    public static void main(String[] args) {

        // Write a Stream Expression to find the strings which start with a given letter(as parameter), in the following list:

        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");

        System.out.println(cityStartsWith(cities, "N"));
    }

    public static List<String> cityStartsWith(List<String> inputCities, String firstChar){

        return inputCities.stream()
                .filter(city -> city.toLowerCase().startsWith(firstChar.toLowerCase()))
                .collect(Collectors.toList());
    }
}
