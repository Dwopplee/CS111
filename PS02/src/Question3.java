import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sysIn = new Scanner(System.in);

        System.out.println("Enter an integer");
        int input = sysIn.nextInt();

        System.out.print(input + " mod 2 = " + (input % 2));
    }
}
