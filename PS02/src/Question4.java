import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sysIn = new Scanner(System.in);

        System.out.println("Enter base and height separated by a space");
        double b = sysIn.nextDouble();
        double h = sysIn.nextDouble();

        System.out.println("Area: " + (b * h / 2));
    }
}
