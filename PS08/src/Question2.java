import java.util.Scanner;

public class Question2 {

    public static void main (String[] args) {

        Scanner sysIn = new Scanner(System.in);

        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();

        Employee e[] = {e1, e2, e3};

        for (int i = 0; i < 3; i++) {
            System.out.println("-- Employee Entry Form --");
            System.out.println("Enter name");
            String name = sysIn.nextLine();

            System.out.println("Enter ID");
            int id = sysIn.nextInt();
            String temp = sysIn.nextLine();

            System.out.println("Enter department");
            String department = sysIn.nextLine();

            System.out.println("Enter position");
            String position = sysIn.nextLine();

            e[i] = new Employee(name, id, department, position);
        }

        System.out.printf("%12s %12s %12s %12s%n", "Name", "ID", "Department", "Position");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%12s %12d %12s %12s%n", e[i].getName(), e[i].getIdNumber(), e[i].getDepartment(),
                    e[i].getPosition());
        }

    }

}
