import java.util.Scanner;

public class Biggest_1013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        int b;
        int c;
        int biggestAB;
        int biggestABC;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        biggestAB = (a + b + Math.abs(a - b)) / 2;
        biggestABC = (biggestAB + c + Math.abs(biggestAB - c)) / 2;

        System.out.println(biggestABC + " is biggest");
    }
}
