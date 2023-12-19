import java.util.Scanner;

public class DistanceBetweenTwoPoints_1015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x1;
        double y1;
        double x2;
        double y2;
        double distance;

        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();

        distance =  Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.println(String.format("%.4f", distance));
    }
}
