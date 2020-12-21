import java.util.Scanner;

public class Question6 {

    public static void main(String[] args) {
        Scanner sysIn = new Scanner(System.in);

        System.out.println("== BMI Calculator ==");

        System.out.println("Step 1: Enter height");
        System.out.println("Feet:");
        int feet = sysIn.nextInt();
        System.out.println("Inches:");
        double inches = sysIn.nextDouble();

        double height = feet * 12 + inches;

        System.out.println("Step 2: Enter weight");
        System.out.println("Pounds:");
        double pounds = sysIn.nextDouble();

        double BMI = pounds * 703 / height / height;

        System.out.printf("BMI: %.1f, you are ", BMI);

        if (BMI > 29.9) {
            System.out.println("obese.");
        } else if (BMI > 25.0) {
            System.out.println("overweight.");
        } else if (BMI > 18.5) {
            System.out.println("normal.");
        } else {
            System.out.println("underweight.");
        }
    }

}
