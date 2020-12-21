import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question2 {

    public static void main (String[] args) throws FileNotFoundException {
        Scanner sysIn = new Scanner (System.in);

        System.out.println("Movie search by year range. Enter two years.");
        int y1 = sysIn.nextInt();
        int y2 = sysIn.nextInt();

        System.out.println("Movies with short names that were released between " + y1 + " and " + y2);

        Scanner fileIn = new Scanner(new File("db.txt"));

        int count = 0;

        while (fileIn.hasNextLine()) {
            String movie = fileIn.nextLine();
            int year = fileIn.nextInt();
            fileIn.nextLine();
            fileIn.nextLine();

            if (year >= y1 && year <= y2) {
                if (movie.length() < 6) {
                    System.out.println(movie);
                    count++;
                }
            }
        }

        if (count == 0) {
            System.out.println("No matching movies found!");
        } else {
            System.out.println("Number of matches: " + count);
        }
    }

}
