import java.util.Scanner;

public class Question1 {

    public static void main (String[] args) {
        Scanner sysIn = new Scanner (System.in);

        System.out.println("Enter a String");
        String input = sysIn.nextLine();

        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                count++;
            }
        }

        System.out.println("Number of whitespace characters: " + count);
    }

}
