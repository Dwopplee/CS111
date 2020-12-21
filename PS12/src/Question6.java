import java.util.Scanner;

public class Question6 {

    public static void main (String[] args) {
        Scanner sysIn = new Scanner (System.in);

        System.out.println("Enter ingredients");
        String input = sysIn.nextLine();
        String[] inputs = input.split(":|>");

        for (String ingredient : inputs) {
            System.out.println(ingredient.trim());
        }
    }

}
