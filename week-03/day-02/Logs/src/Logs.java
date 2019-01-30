// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP addresses.
// Write a function that returns the GET / POST request ratio.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logs {

    public static void main(String[] args) {

        Path pathToLogsFile = Paths.get("log.txt");
        List<String> logs = new ArrayList<>();
        try {
            logs = Files.readAllLines(pathToLogsFile);
        } catch (IOException e){
            System.err.println("Cannot read specified file: " + e.getMessage());
        }

        System.out.println(getIpAddresses(logs));
        System.out.println(getPostRatio(logs));
    }

    private static ArrayList<String> getIpAddresses(List<String> logs){
        ArrayList<String> uniqueIpAddresses = new ArrayList<>();

        String currentIp;
        for (String log : logs){
            currentIp = log.split("   ")[1];
            if (!uniqueIpAddresses.contains(currentIp)){
                uniqueIpAddresses.add(currentIp);
            }
        }
        return uniqueIpAddresses;
    }

    private static String getPostRatio(List<String> logs){
        int numberOfGetRequests = 0;
        int numberOfPostRequests = 0;

        for (String log: logs) {
            if (log.endsWith("POST /")) {
                numberOfPostRequests++;
            } else if (log.endsWith("GET /")){
                numberOfGetRequests++;
            }
        }
        return numberOfGetRequests + " : " + numberOfPostRequests;
    }
}
