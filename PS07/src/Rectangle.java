import java.util.Scanner;

public class Rectangle {

    //Ask the user for the length of the rectangle.
    public static double getLength(Scanner keyboard) {
        System.out.println("Enter length: ");
        return keyboard.nextDouble();
    }

    //Ask the user for the width of the rectangle
    public static double getWidth(Scanner keyboard) {
        System.out.println("Enter width: ");
        return keyboard.nextDouble();
    }

    //Calculate the area of the rectangle
    public static double getArea(double length, double width) {
        return length * width;
    }

    //Display the information about the rectangle
    public static void displayData(double length, double width) {
        System.out.printf("-- Rectangle info --%n" +
                "Length: %.1f%n" +
                "Width: %.1f%n" +
                "Area: %.1f%n",
                length, width, (length * width));
    }

}
