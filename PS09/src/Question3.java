import java.util.Scanner;

public class Question3 {

    public static void main (String[] args) {
        Scanner sysIn = new Scanner (System.in);

        System.out.println("How many integers do you have? (Max 20)");
        int max = sysIn.nextInt();

        if (max <= 20 && max >= 1) {
            int[] ints = new int[max];

            for (int i = 0; i < max; i++) {
                System.out.println("Enter element for subscript " + i);
                ints[i] = sysIn.nextInt();
            }

            System.out.println("Here are all of those numbers");

            int sum = 0;

            for (int i = 0; i < max; i++) {
                System.out.println(ints[i]);
                sum += ints[i];
            }

            System.out.println("The sum of these numbers is " + sum);

        } else {
            System.out.println("You must enter a number in between 1 and 20");
        }
    }

}
