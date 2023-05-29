package com.br.uri.beginner;

import java.util.Scanner;

public class BhaskaraFormula_1036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double delta;
        double R1;
        double R2;

        if ((a == 0) || (b * b - 4 * a * c < 0)) {
            System.out.println("Impossible to calculate");
        } else {

            delta = Math.sqrt((b * b) + (-4 * (a * c)));
            R1 = (-b + delta) / (2 * a);
            R2 = (-b - delta) / (2 * a);
            System.out.printf("R1 = %.5f%n", R1);
            System.out.printf("R2 = %.5f%n", R2);
        }
    }
}
