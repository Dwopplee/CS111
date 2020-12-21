import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question3 {

    public static void main (String[] args) throws FileNotFoundException {
        Scanner sysIn = new Scanner (System.in);

        System.out.println("Similar title finder. Enter a movie name.");
        String name = sysIn.nextLine();

        System.out.println("Here are the 3 movies that are listed before the one you entered");

        Scanner fileIn = new Scanner(new File("db.txt"));

        int count = 0;

        while (fileIn.hasNextLine()) {
            String movie = fileIn.nextLine();
            fileIn.nextInt();
            fileIn.nextLine();
            fileIn.nextLine();
            count++;

            if (movie.equals(name)) {
                break;
            }
        }

        Scanner fileIn2 = new Scanner(new File("db.txt"));

        for (int i = 1; i < count; i++) {
            String movie = fileIn2.nextLine();
            fileIn2.nextInt();
            fileIn2.nextLine();
            fileIn2.nextLine();

            if (i >= count - 3) {
                System.out.println(movie);
            }
        }
    }

}
