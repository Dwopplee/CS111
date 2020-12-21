import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        Scanner sysIn = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int input = sysIn.nextInt();

        if (input % 2 == 0) {
            System.out.println(input + " is even.");
        } else {
            System.out.println(input + " is odd.");
        }
    }

}
