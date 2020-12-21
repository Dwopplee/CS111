import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileStats {

    private String filename;

    public FileStats (String name) {
        filename = name;
    }

    public int getNumLines() throws FileNotFoundException {
        int lines = 0;
        Scanner fileIn = new Scanner(new File(filename));
        while(fileIn.hasNextLine()) {
            fileIn.nextLine();
            lines++;
        }
        return lines;
    }

    public int getNumMatchingWords (String key) throws FileNotFoundException {
        Scanner fileIn = new Scanner(new File(filename));
        int lines = 0;
        while(fileIn.hasNextLine()) {
            if(fileIn.nextLine().toLowerCase().contains(key.toLowerCase())) {
                lines++;
            }
        }
        return lines;
    }

}
