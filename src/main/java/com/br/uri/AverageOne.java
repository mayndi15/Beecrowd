package com.br.uri;

import java.util.Scanner;

public class AverageOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A;
        double B;
        double AVERAGE;

        A = sc.nextDouble();
        B = sc.nextDouble();

        AVERAGE = ((A * 3.5) + (B * 7.5)) / 11.0;

        System.out.printf("AVERAGE = %.5f%n", AVERAGE);
    }
}
