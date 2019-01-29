import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.Collections;

public class PrintEachLine {
    public static void main(String[] args) throws IOException {
        // Write a program that opens a file called "my-file.txt", then prints
        // each line from the file.
        // If the program is unable to read the file (for example it does not exist),
        // then it should print the following error message: "Unable to read file: my-file.txt"

        Path myFilePath = Paths.get("my-file.txt");
        // Files.write(myFilePath, Collections.singleton("hello"));

        try{
            for (String line : Files.readAllLines(myFilePath)) {
                System.out.println(line);
            }
        } catch (NoSuchFileException e){
            System.err.println("Unable to read file: " + e.getMessage());
        }
    }
}
