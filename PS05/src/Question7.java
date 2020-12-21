import java.util.Scanner;

public class Question7 {

    public static void main (String[] args) {
        int input;
        Scanner sysIn = new Scanner(System.in);

        do {
            System.out.println("Enter zero to exit:");
            input = sysIn.nextInt();
        } while (input != 0);
    }

}
