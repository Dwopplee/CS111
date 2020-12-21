import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sysIn = new Scanner(System.in);

        System.out.println("Enter first number");
        int addend = sysIn.nextInt();

        System.out.println("Enter second number");
        int factor = sysIn.nextInt();

        for(int i = 1; i <= 5; i++) {
            int multiple = factor * i;
            System.out.println(addend + " + " + multiple + " = " + (addend + multiple));
        }
    }
}
