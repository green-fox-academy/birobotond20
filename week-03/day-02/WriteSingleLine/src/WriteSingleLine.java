import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteSingleLine {
    public static void main(String[] args) {
        // Write a function that is able to manipulate a file
        // By writing your name into it as a single line
        // The file should be named "my-file.txt"
        // In case the program is unable to write the file,
        // It should print the following error message: "Unable to write file: my-file.txt"

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me your name on the next line: ");
        String name = scanner.nextLine();
        Path pathToFile = Paths.get("my-file.txt");
        writeNameToFile(pathToFile, name);
    }

    private static void writeNameToFile (Path filename, String name){
        List<String> linesToWrite = new ArrayList<>();
        linesToWrite.add(name);
        try {
            Files.write(filename, linesToWrite);
        } catch (IOException e){
            System.err.println("Unable to write file: my-file.txt");
        }
    }
}
