package com.br.uri;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double areaTR = (A * C) / 2;
        double areaC = 3.14159 * Math.pow(C, 2);
        double areaTP = 0.5 * C * (A + B);
        double areaSQ = Math.pow(B, 2);
        double areaR = A * B;

        System.out.printf("TRIANGLE: %.3f%n", areaTR);
        System.out.printf("CIRCLE: %.3f%n", areaC);
        System.out.printf("TRAPEZIO: %.3f%n", areaTP);
        System.out.printf("SQUARE: %.3f%n", areaSQ);
        System.out.printf("RECTANGLE: %.3f%n", areaR);
    }
}
