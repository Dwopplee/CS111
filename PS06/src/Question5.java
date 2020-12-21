import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Question5 {

    public static void main (String[] args) throws FileNotFoundException {
        Scanner sysIn = new Scanner(System.in);

        System.out.println("Enter word to spellcheck (or exit to end)");
        String input = sysIn.nextLine();

        while (!input.equals("exit")) {
            Scanner fileIn = new Scanner(new File("dictionary.txt"));
            boolean correct = false;
            while (fileIn.hasNextLine()) {
                if (input.equals(fileIn.nextLine())) {
                    correct = true;
                    break;
                }
            }

            if (correct) {
                System.out.println(input + " is spelled correctly.");
            } else {
                System.out.println(input + " is not spelled correctly.");
            }

            System.out.println("Enter word to spellcheck (or exit to end)");
            input = sysIn.nextLine();
        }

        System.out.println("Ending program...");
    }

}
