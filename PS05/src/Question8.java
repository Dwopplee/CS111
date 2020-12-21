import java.util.Scanner;

public class Question8 {

    public static void main (String[] args) {
        int input;
        Scanner sysIn = new Scanner(System.in);

        do {
            System.out.println("Which direction would you like to move?\n" +
                    "[8] North\n" +
                    "[4] West\n" +
                    "[2] South\n" +
                    "[6] East\n" +
                    "[0] Exit");
            input = sysIn.nextInt();

            switch(input) {
                case 8:
                    System.out.println("You moved north.");
                    break;
                case 4:
                    System.out.println("You moved west.");
                    break;
                case 2:
                    System.out.println("You moved south.");
                    break;
                case 6:
                    System.out.println("You moved east.");
                    break;
            }

        } while (input != 0);
    }

}
