import java.util.Scanner;

public class SumOfConsecutiveOddNumbersOne_1071 {
    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = 0;

        if (x < y) {
            for (int i = x + 1; i < y; i++) {
                if (i % 2 != 0) {
                    sum += i;
                }
            }
        } else {
            for (int i = y + 1; i < x; i++) {
                if (i % 2 != 0) {
                    sum += i;
                }
            }
        }
        System.out.println(sum);
    }
}
