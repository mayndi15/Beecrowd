package com.br.uri;

import java.util.Scanner;

public class Triangle_1043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        if ((A < B + C) && (B < A + C) && (C < A + B)) {
            double p = A + B + C;
            System.out.println("Perimetro = " + p);
        } else {
            double a = 0.5 * C * (A + B);
            System.out.println("Area = " + a);
        }
    }
}
