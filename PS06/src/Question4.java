import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Question4 {

    public static void main (String[] args) {
        Scanner sysIn = new Scanner(System.in);

        System.out.println("Enter filename");
        String file = sysIn.next();

        int line = 1;

        try {
            Scanner fileIn = new Scanner(new File(file));

            while (fileIn.hasNextLine()) {
                System.out.println(line + ": " + fileIn.nextLine());
                line++;
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("File not found");
        }

    }
}
