import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {
        Scanner sysIn = new Scanner(System.in);

        System.out.println("Enter your score:");
        int score = sysIn.nextInt();

        if (score >= 7000) {
            System.out.print("1UP");
        } else if (score < 0) {
            System.out.print("You got less than zero?  This score is invalid.");
        } else {
            System.out.print("You need " + (7000 - score) + " more points for a 1UP");
        }
    }

}
