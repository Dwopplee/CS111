import java.util.Scanner;

public class Question1 {

    public static void main (String[] args) {
        Scanner sysIn = new Scanner (System.in);

        System.out.println("Enter an ending value");
        int value = sysIn.nextInt();

        int up = 0;

        do {
            System.out.println("Count up or down?");
            String direction = sysIn.next();

            if (direction.equalsIgnoreCase("up")) {
                up = 1;
            } else if (direction.equalsIgnoreCase("down")) {
                up = -1;
            }
        } while (up == 0);

        for (int i = up; Math.abs(i) <= value; i += up) {
            System.out.printf("%5d%5d%5d%n", i, (i + 10), (i + 100));
        }



    }

}
