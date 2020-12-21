import java.util.Scanner;

public class Question8 {

    public static void main(String[] args) {
        Scanner sysIn = new Scanner(System.in);

        System.out.println("Enter number of seconds");
        int input = sysIn.nextInt();

        int days = input / 86400;
        int temp = input % 86400;
        int hours = temp /3600;
        temp = temp % 3600;
        int mins = temp / 60;
        int secs = temp % 60;

        if (days != 0) {
            System.out.println(days + " day(s)");
        }
        if (hours != 0) {
            System.out.println(hours + " hour(s)");
        }
        if (mins != 0) {
            System.out.println(mins + " minute(s)");
        }
        if (secs != 0) {
            System.out.println(secs + " second(s)");
        }

    }
}
