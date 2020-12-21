import java.util.Scanner;

public class Question5 {

    public static void main(String[] args) {
        Scanner sysIn = new Scanner(System.in);

        System.out.println("Enter first number");
        double first = sysIn.nextDouble();

        System.out.println("Enter second number");
        double second = sysIn.nextDouble();

        System.out.println("Enter a menu option\n" +
                "[1] Add\n" +
                "[2] Subtract\n" +
                "[3] Multiply\n" +
                "[4] Divide");
        int option = sysIn.nextInt();

        switch(option) {
            case 1:
                System.out.printf("%.1f + %.1f = %.1f\n", first, second, first + second);
                break;
            case 2:
                System.out.printf("%.1f - %.1f = %.1f\n", first, second, first - second);
                break;
            case 3:
                System.out.printf("%.1f * %.1f = %.1f\n", first, second, first * second);
                break;
            case 4:
                if (second == 0.0) {
                    System.out.println("If division is selected the second number cannot be zero");
                } else {
                    System.out.printf("%.1f / %.1f = %.1f\n", first, second, first / second);
                }
                break;
            default:
                System.out.println("Invalid menu option");
                break;
        }

    }

}
