import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        Scanner sysIn = new Scanner(System.in);

        System.out.println("== One Year Interest Calculator ==");

        System.out.println("How much money do you have?");
        double balance = sysIn.nextDouble();

        System.out.println("What's the interest rate?");
        double interest = sysIn.nextDouble();

        double earned = balance * interest / 100;
        System.out.println("Interest earned: $" + earned);
        System.out.println("New balance: $" + (balance + earned));
    }

}
