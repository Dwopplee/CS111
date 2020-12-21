import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {
        Scanner sysIn = new Scanner(System.in);

        System.out.println("What's your favorite city?");
        String input = sysIn.nextLine();

        System.out.println("Number of characters: " + input.length());
        System.out.println("First character: " + input.charAt(0));
        System.out.println("Uppercase: " + input.toUpperCase());
        System.out.println("Lowercase: " + input.toLowerCase());
    }

}
