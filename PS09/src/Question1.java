import java.util.Scanner;

public class Question1 {

    public static void main (String[] args) {
        Scanner sysIn = new Scanner (System.in);

        System.out.println("How many integers do you have? (Max 20)");
        int max = sysIn.nextInt();

        int[] ints = new int[max];

        for (int i = 0; i < max; i++) {
            System.out.println("Enter element for subscript " + i);
            ints[i] = sysIn.nextInt();
        }

        System.out.println("Here are all of those numbers");

        for (int i = 0; i < max; i++) {
            System.out.println(ints[i]);
        }
    }

}
