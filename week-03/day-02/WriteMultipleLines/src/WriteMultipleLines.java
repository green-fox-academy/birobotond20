// Create a function that takes 3 parameters: a path, a word and a number
// and is able to write into a file.
// The path parameter should be a string that describes the location of the file you wish to modify
// The word parameter should also be a string that will be written to the file as individual lines
// The number parameter should describe how many lines the file should have.
// If the word is 'apple' and the number is 5, it should write 5 lines
// into the file and each line should read 'apple'
// The function should not raise any errors if it could not write the file.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteMultipleLines {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me a filename, a word and a number: ");
        String parameters = scanner.nextLine();
        scanner.close();
        String filename = parameters.split(" ")[0];
        String word = parameters.split(" ")[1];
        int numberOfLines = Integer.parseInt(parameters.split(" ")[2]);
        writeMultipleLinesToFile(filename, word, numberOfLines);
    }

    private static void writeMultipleLinesToFile(String path, String wordToWrite, int numberOfLines){

        List<String> words = new ArrayList<>();
        for (int i = 0; i < numberOfLines; i++) {
            words.add(wordToWrite);
        }

        try {
            Files.write(Paths.get(path), words);
        } catch (IOException e){
        }
    }
}
