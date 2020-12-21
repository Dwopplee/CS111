import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {
        Scanner sysIn = new Scanner(System.in);

        System.out.println("How many batches of cookies do you want?");
        int batches = sysIn.nextInt();

        System.out.println(batches + " batches? That's " + (batches * 48) + " cookies.");

        System.out.println("Alright, here is what you need");
        System.out.println((1.5 * batches) + " cups of sugar");
        System.out.println((1.0 * batches) + " cup of butter");
        System.out.println((2.75 * batches) + " cups of flour");
    }

}
