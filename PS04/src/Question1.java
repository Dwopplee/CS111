import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        Scanner sysIn = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = sysIn.nextInt();

        if (age >= 35) {
            System.out.println(age + "?  You can run for President!");
        } else {
            System.out.println(age + "?  You cannot run for President!");
        }
    }

}
