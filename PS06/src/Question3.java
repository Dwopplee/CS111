import java.util.Scanner;

public class Question3 {

    public static void main (String[] args) {
        Scanner sysIn = new Scanner (System.in);

        System.out.println("Enter a height");
        int height = sysIn.nextInt();

        if (height >= 1) {
            for (int i = 1; i <= height; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            System.out.println("Height must be at least one.");
        }
    }

}
