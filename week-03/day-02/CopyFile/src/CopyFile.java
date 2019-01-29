// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CopyFile {

    public static void main(String[] args) throws IOException {

        //Path pathToFile = Paths.get("my-txt-file.txt");
        //Files.write(pathToFile, Collections.singleton("alma\nkörte\nbarack\nszőlő\ndinnye"));
        System.out.println(copyFiles("my-txt-file.txt", "copied-content-from-my-txt.txt"));
    }

    private static boolean copyFiles (String copyFrom, String copyTo){

        try {
            List<String> linesOfFirstFile = Files.readAllLines(Paths.get(copyFrom));
            Files.write(Paths.get(copyTo), linesOfFirstFile);
            return true;
        } catch (IOException e){
            return false;
        }
    }
}
