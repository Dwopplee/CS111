import java.util.Scanner;

public class Question5 {

    public static void main(String[] args) {
        Scanner sysIn = new Scanner(System.in);

        System.out.println("Enter a name");
        String name = sysIn.nextLine();

        System.out.println("Enter an age");
        int age = sysIn.nextInt();

        String temp = sysIn.nextLine();

        System.out.println("Enter a city");
        String city = sysIn.nextLine();

        System.out.println("Enter the name of a college");
        String college = sysIn.nextLine();

        System.out.println("Enter a profession");
        String job = sysIn.nextLine();

        System.out.println("Enter an animal");
        String animal = sysIn.nextLine();

        System.out.println("Enter a pet name");
        String pet = sysIn.nextLine();

        System.out.println("Here's your story\n" +
                           "There was once someone named " + name + " who lived in " + city + ".\n" +
                           "At the age of " + age + ", " + name + " went to college at " + college + ".\n" +
                           "After 4 years, " + name + " was " + (age + 4) + ".\n" +
                           name + " then graduated and went to work as a " + job + ".\n" +
                           "Then, " + name + " adopted a(n) " + animal + " named " + pet + ".\n" +
                           "They both lived happily ever after!");
    }

}
