import java.util.Scanner;

public class Question7 {

    public static void main(String[] args) {
        Scanner sysIn = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 10");
        int input = sysIn.nextInt();

        if (input >= 1 && input <= 10) {
            if (input == 10) {
                System.out.println("X");
            } else if (input == 4) {
                System.out.println("IV");
            } else if (input == 9) {
                System.out.println("IX");
            } else {
                if (input >= 5) {
                    System.out.print("V");
                    input -= 5;
                }

                while(input > 0) {
                    System.out.print("I");
                    input--;
                }
                System.out.println();
            }
        } else {
            System.out.println("That's not between 1 and 10");
        }
    }

}
