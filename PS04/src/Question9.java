import java.util.Scanner;

public class Question9 {

    public static void main(String[] args) {
        Scanner sysIn = new Scanner(System.in);

        System.out.println("Enter number of software packages to purchase");
        int packages = sysIn.nextInt();

        double discount = 0.0;
        boolean skip = false;

        if (packages >= 100) {
            System.out.println("Since you purchased " + packages + " packages, you earned a discount of 50%!");
            discount = 0.5;
        } else if (packages >= 50) {
            System.out.println("Since you purchased " + packages + " packages, you earned a discount of 40%!");
            discount = 0.4;
        } else if (packages >= 20) {
            System.out.println("Since you purchased " + packages + " packages, you earned a discount of 30%!");
            discount = 0.3;
        } else if (packages >= 10) {
            System.out.println("Since you purchased " + packages + " packages, you earned a discount of 20%!");
            discount = 0.2;
        } else {
            skip = true;
        }

        double subtotal = packages * 99.0;
        double total = subtotal * (1.0 - discount);

        if (!skip) {
            System.out.printf("Pre-discount total: $%,.2f\n", subtotal);
        }
        System.out.printf("Total cost: $%,.2f", total);


    }

}
