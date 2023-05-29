package com.br.uri;

import java.util.Scanner;

public class AverageTwo_1006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A;
        double B;
        double C;
        double AVERAGE;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        AVERAGE = ((A * 2.0) + (B * 3.0) + (C * 5.0)) / 10.0;

        System.out.printf("AVERAGE = %.1f%n", AVERAGE);
    }
}
