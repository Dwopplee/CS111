public class Employee {

    private String name;
    private int idNumber;
    private String department;
    private String position;

    public Employee() {
        name = "(not set)";
        idNumber = 0;
        department = "(not set)";
        position = "(not set)";
    }

    public Employee(String n, int id) {
        name = n;
        idNumber = id;
        department = "(not set)";
        position = "(not set)";
    }

    public Employee(String n, int id, String dep, String pos) {
        name = n;
        idNumber = id;
        department = dep;
        position = pos;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }

    public int getIdNumber() {
        return idNumber;
    }

}
