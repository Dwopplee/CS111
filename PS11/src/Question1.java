import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question1 {

    public static void main (String[] args) throws FileNotFoundException {
        Scanner sysIn = new Scanner (System.in);

        System.out.println("Movie search by characters. Enter two characters.");
        String input = sysIn.nextLine();

        System.out.println("Movies that start with " + input);

        Scanner fileIn = new Scanner(new File("db.txt"));

        int count = 0;

        while (fileIn.hasNextLine()) {
            String line = fileIn.nextLine();
            if (line.length() < 2) {
                continue;
            }
            if (line.charAt(0) == input.charAt(0)) {
                if (line.charAt(1) == input.charAt(1)) {
                    System.out.println(line);
                    count++;
                }
            }
        }

        System.out.println("Number of matches: " + count);
    }

}
