import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sysIn = new Scanner(System.in);

        System.out.println("Enter an integer");
        int input = sysIn.nextInt();

        System.out.println(input + " + 1 = " + (input + 1));
    }
}
