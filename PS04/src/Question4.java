import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {
        Scanner sysIn = new Scanner(System.in);

        System.out.println("Enter a time value in the following format: HH MM SS");
        int hour24 = sysIn.nextInt();
        int min = sysIn.nextInt();
        int sec = sysIn.nextInt();

        int hour12 = hour24;

        if (hour24 > 23 || hour24 < 0) {
            System.out.print("Hour must be between 0 and 23 inclusive.");
        } else {
            if (hour24 % 12 == 0) {
                hour12 = 12;
            } else {
                hour12 = hour24 % 12;
            }

            System.out.printf("%02d:%02d:%02d", hour12, min, sec);
            if(hour24 < 12) {
                System.out.println("AM");
            } else {
                System.out.println("PM");
            }
        }
    }

}
