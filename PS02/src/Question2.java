import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sysIn = new Scanner(System.in);

        System.out.println("Enter an integer");
        double input = sysIn.nextDouble();

        System.out.println(input + " + 1.0 = " + (input + 1.0));
    }
}
