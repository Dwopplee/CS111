import java.util.Scanner;

public class Question6 {

    public static void main (String[] args) {
        Scanner sysIn = new Scanner(System.in);

        System.out.println("Enter name");
        String name = sysIn.nextLine();
        TestScores student = new TestScores(name);

        int i = 1;
        double score;

        do {
            System.out.println("Enter score " + i + " or a negative number to exit");
            score = sysIn.nextDouble();

            if (score >= 0) {
                student.addTestScore(score);
            }

            i++;
        } while (score >= 0);

        System.out.printf("-- %s --%nNum tests taken: %d%nAverage: %.1f%n", name, student.getNumTestsTaken(),
                student.getAverage());
    }

}
