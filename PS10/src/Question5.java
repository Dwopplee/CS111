import java.util.Scanner;

public class Question5 {

    public static void main (String[] args) {
        Scanner sysIn = new Scanner (System.in);

        System.out.println("Check your lottery numbers here!");

        int[] winners = {8, 13, 27, 53, 54};
        int matches = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter number " + i + ":");
            int input = sysIn.nextInt();

            if (input < 1 || input > 99) {
                i--;
                System.out.println("Must be between 1 and 99");
                continue;
            }

            for (int j = 0; j < 5; j++) {
                if (input == winners[j]) {
                    matches++;
                }
            }
        }

        System.out.println("All set. The winning numbers were: 8 13 27 53 54");

        if (matches < 5) {
            System.out.println("Well, you didn't win. You got " + matches + " matching number(s)");
        } else {
            System.out.println("WOW! Grand prize winner!");
        }
    }

}
