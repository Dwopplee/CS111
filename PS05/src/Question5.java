import java.util.Scanner;

public class Question5 {

    public static void main (String[] args) {
        Scanner sysIn = new Scanner(System.in);

        System.out.println("Enter a positive, non-zero integer");
        int input = sysIn.nextInt();

        if (input < 0) {
            System.out.println("Hey, I said positive");
        } else if (input == 0) {
            System.out.println("Hey, I said non-negative");
        } else {
            int sum = 0;
            for (int i = 1; i <= input; i++) {
                sum += i;
            }
            System.out.println("Sum of numbers from 1 to " + input + " is " + sum);
        }
    }

}
