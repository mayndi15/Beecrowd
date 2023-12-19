import java.text.DecimalFormat;
import java.util.Scanner;

public class AverageThree_1040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0.0");
        double N1 = sc.nextDouble();
        double N2 = sc.nextDouble();
        double N3 = sc.nextDouble();
        double N4 = sc.nextDouble();
        double average;

        average = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / 10;
        System.out.println("Average: " + df.format(average));

        if (average >= 7) {
            System.out.println("Student approved.");

        } else if (average < 5) {
            System.out.println("Student failed.");

        } else if (average >= 5 && average < 7) {
            System.out.println("Student in exam.");

            double exam = sc.nextDouble();
            System.out.println("Exam grade: " + df.format(exam));
            average = (average + exam) / 2;

            if (average >= 5) {
                System.out.println("Student approved.");
            } else {
                System.out.println("Student failed.");
            }
            System.out.println("Average final: " + df.format(average));
        }
    }
}
