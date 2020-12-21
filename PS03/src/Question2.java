import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        Scanner sysIn = new Scanner(System.in);

        System.out.println("Enter some text");
        String input = sysIn.nextLine();

        System.out.println("You entered: " + input);
        System.out.println("First letter: " + input.charAt(0));
        System.out.println("Last letter: " + input.charAt(input.length() -1));
    }

}
