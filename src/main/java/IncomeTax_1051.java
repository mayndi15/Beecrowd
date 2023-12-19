import java.text.DecimalFormat;
import java.util.Scanner;

public class IncomeTax_1051 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0.00");
        double salary = sc.nextDouble();

        double amount;
        double percentage;
        double tax;

        if (salary > 2000 && salary <= 3000) {
            amount = salary - 2000;
            percentage = 0.08;
            tax = amount * percentage;
            System.out.println("$ " + df.format(tax));
        } else if (salary > 3000 && salary <= 4500) {
            amount = salary - 3000;
            percentage = 0.18;
            tax = (amount * percentage) + 80;
            System.out.println("$ " + df.format(tax));
        } else if (salary > 4500) {
            amount = salary - 4500;
            percentage = 0.28;
            tax = (amount * percentage) + 350;
            System.out.println("$ " + df.format(tax));
        } else {
            System.out.println("Free");
        }
    }
}
