import java.util.Scanner;

public class Question4 {

    public static void main (String[] args) {
        Scanner sysIn = new Scanner (System.in);

        System.out.println("Enter five names");
        String[] names = new String[5];

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter friend " + i);
            names[i - 1] = sysIn.nextLine();
        }

        System.out.println("Here are all of those names");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Friend " + i + " is " + names[i - 1]);
        }

    }

}
