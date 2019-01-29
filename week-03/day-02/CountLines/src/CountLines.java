// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;

public class CountLines {

    public static void main(String[] args) throws IOException {

        Path pathToMyFile = Paths.get("my-file.txt");
        //Files.write(pathToMyFile, Collections.singleton("hello"));
        System.out.println(countLinesInFile("hello.txt"));
    }

    private static int countLinesInFile(String filename){

        try {
            return (int) Files.lines(Paths.get(filename)).count();
        } catch (IOException e){
            return 0;
        }
    }
}
