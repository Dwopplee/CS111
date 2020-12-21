import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question4 {

    public static void main (String[] args) throws FileNotFoundException {
        Scanner sysIn = new Scanner (System.in);

        System.out.println("Enter a filename");
        String name = sysIn.nextLine();

        FileStats file = new FileStats(name);

        System.out.println(name + " has " + file.getNumLines() + " lines");

        System.out.println("Enter some text");
        String text = sysIn.nextLine();

        System.out.println(file.getNumMatchingWords(text) + " line(s) contain \"" + text + "\"");
    }

}
