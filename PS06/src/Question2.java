import java.util.Scanner;

public class Question2 {

    public static void main (String[] args) {
        Scanner sysIn = new Scanner(System.in);

        System.out.println("How many dollars will you spend?");
        int dollars = sysIn.nextInt();

        int coffees = dollars;
        int stars = dollars;

        while (stars >= 7) {
            int extra = stars / 7;
            coffees += extra;
            stars %= 7;
            stars += extra;
        }

        System.out.println("Coffees: " + coffees);
        System.out.println("Stars remaining: " + stars);
    }

}
